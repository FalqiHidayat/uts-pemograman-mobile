package com.electro.falqishoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAsus,btnLenovo, btnMacbook;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAsus = findViewById(R.id.btn_buka_Asus);
        btnLenovo = findViewById(R.id.btn_buka_Lenovo);
        btnMacbook = findViewById(R.id.btn_buka_Macbook);
        btnAsus.setOnClickListener(view -> bukaGaleri("Asus"));
        btnLenovo.setOnClickListener(view -> bukaGaleri("Lenovo"));
        btnMacbook.setOnClickListener(view -> bukaGaleri("Lenovo"));
    }

    private void bukaGaleri(String tipeLaptop) {
        Log.d("MAIN","Buka activity asus");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, tipeLaptop);
        startActivity(intent);
    }

}