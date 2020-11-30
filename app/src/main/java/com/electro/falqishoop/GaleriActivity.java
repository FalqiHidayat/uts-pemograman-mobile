package com.electro.falqishoop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.electro.falqishoop.tipe.Laptop;

public class GaleriActivity extends AppCompatActivity {

    List<Laptop> laptops;
    int indeksTampil = 0;
    String tipeLaptop;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txTipe,txRas,txHarga,txDeskripsi,txJudul;
    ImageView ivFotoLaptop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_laptop);
        Intent intent = getIntent();
        tipeLaptop = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        laptops = DataProvider.getLaptopsByTipe(this,tipeLaptop);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> hewanPertama());
        btnTerakhir.setOnClickListener(view -> hewanTerakhir());
        btnSebelumnya.setOnClickListener(view -> hewanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> hewanBerikutnya());

        txTipe = findViewById(R.id.txTipe);
        txRas = findViewById(R.id.txRas);
        txHarga = findViewById(R.id.txHarga);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoLaptop = findViewById(R.id.gambarLaptop);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Tipe Laptop "+tipeLaptop);
    }


    private void tampilkanProfil() {
        Laptop k = laptops.get(indeksTampil);
        Log.d("ANJING","Menampilkan anjing "+k.getTipe());
        txTipe.setText(k.getTipe());
        txRas.setText(k.getRas());
        txHarga.setText(k.getHarga());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoLaptop.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void hewanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void hewanTerakhir() {
        int posAkhir = laptops.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void hewanBerikutnya() {
        if (indeksTampil == laptops.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void hewanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}