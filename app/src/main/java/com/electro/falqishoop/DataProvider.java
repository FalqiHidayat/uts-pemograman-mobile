package com.electro.falqishoop;

import android.content.Context;

import com.electro.falqishoop.tipe.Asus;
import com.electro.falqishoop.tipe.Laptop;
import com.electro.falqishoop.tipe.Lenovo;
import com.electro.falqishoop.tipe.Macbook;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Laptop> laptops = new ArrayList<>();

    private static List<Asus> initDataAsus(Context ctx) {
        List<Asus> asuss = new ArrayList<>();
        asuss.add(new Asus("ASUS ROG GL503GE EN023T", "Rp23.000.000",
                "Spesifikasi ASUS ROG GL503GE EN023T\n" +
                        "\n" +
                        "Display : 15.6-inch Full HD (1920×1080) TN panel, 120Hz, 3ms, 94% NTSC\n" +
                        "Processor : Intel® Core™ i7-8750H Processor 2.2 GHz (9M Cache, up to 4.1 GHz)\n" +
                        "Memory : 8GB DDR4, 2666MHz (up to 32 GB)\n" +
                        "Hard Drive : 1TB SSHD\n" +
                        "Graphics : NVIDIA® GeForce® GTX1050Ti 4GB GDDR5 VRAM", R.drawable.asus1));
        asuss.add(new Asus("ASUS ROG GL504GM", "Rp25.000.000",
                "Intel Core i7-8750H 2.2-4.1 GHz 6-core\n" +
                        "    16GB DDR4 Memory RAM, 1TB SSHD, 256GB NVMe SSD\n" +
                        "    15.6″ FHD 1980 x 1080 144Hz IPS Panel 3ms\n" +
                        "    NVIDIA GeForce GTX 1060 6GB GDDR5 (dedicated)", R.drawable.asus2));
        asuss.add(new Asus("ASUS TUF FX505DT-R7586T", "Rp. 25.700.000",
                "Processor : AMD Ryzen 7 3750H Processor\n" +
                        "Operating System : Windows 10 Home\n" +
                        "Memory : 8GB SDRAM", R.drawable.asus3));
        asuss.add(new Asus("ASUS-ROG-GL503GE-Hero-324x324", "Rp. 50.000.000",
                "Intel Core i7-8750H\n" +
                        "    8 GB DDR4\n" +
                        "    128 GB SSD + 1 TB SSHD", R.drawable.asus4));
        return asuss;
    }

    private static List<Lenovo> initDataLenovo(Context ctx) {
        List<Lenovo> lenovos = new ArrayList<>();
        lenovos.add(new Lenovo("Lenovo - Ideapad 330-15IGM", "Rp. 3.450.000",
                "Laptop Lenovo 3JT-AN - Ideapad 330-15IGM N4000 4GB HD 500GB DVDRW 15,6 - 4 gb", R.drawable.lenovo1));
        lenovos.add(new Lenovo("LENOVO IDEAPAD SLIM 3", "Rp. 3.000.000) ",
                "LAPTOP LENOVO IDEAPAD SLIM 3 - i5 1035G1 8GB 512GB SSD MX330 WIN10+OHS", R.drawable.lenovo2));
        lenovos.add(new Lenovo("Lenovo Thinkpad X1 Carbon", "Rp. 8.000.000",
                "Spesifikasi :\n" +
                        "● Processor Core I5 6300U 2.3ghz\n" +
                        "● DDR3 8GB\n" +
                        "● SSD 240GB ", R.drawable.lenovo3));
        lenovos.add(new Lenovo("Lenovo X240", "Rp. 5.000.000",
                "Laptop Lenovo X240 Core i5 - Ram 8gb - Hdd 500gb- Beragarans", R.drawable.lenovo4));
        return lenovos;
    }

    private static List<Macbook> initDataMacbook(Context ctx) {
        List<Macbook> macbooks = new ArrayList<>();
        macbooks.add(new Macbook("Macbook Pro 2020 13 inch", "Rp. 12.000.000",
                "New Macbook Pro 2020 13 inch M1 Chip 8 Core CPU/ 8 Core GPU/ 256GB SSD - Space Gray", R.drawable.mac1));
        macbooks.add(new Macbook("MACKBOOK AIR 2016 MMGF2", "Rp. 12.000.000",
                "NEW MACKBOOK AIR 2016 MMGF2 AIR 13INCH/i5/1.66GHz/8GB/128GB", R.drawable.mac2));
        macbooks.add(new Macbook("Mackbook pro 2019 MUHP2", "Rp. 19.000.000",
                "Deskripsi Mackbook pro 2019 MUHP2 touch bar 8gb/ssd256 NEW BNIB", R.drawable.mac3));
        macbooks.add(new Macbook("Mackbook Pro Touch Bar 2018 MR9Q2", "Rp. 29.999.999",
                "New Mackbook Pro Touch Bar 2018 MR9Q2 13.3/2.3GHz /8GB/256GB SpaceGrey", R.drawable.mac4));
        return macbooks;
    }
    private static void initAllLaptops(Context ctx) {
        laptops.addAll(initDataAsus(ctx));
        laptops.addAll(initDataLenovo(ctx));
        laptops.addAll(initDataMacbook(ctx));
    }

    public static List<Laptop> getAllLaptop(Context ctx) {
        if (laptops.size() == 0) {
            initAllLaptops(ctx);
        }
        return  laptops;
    }

    public static List<Laptop> getLaptopsByTipe(Context ctx, String tipe) {
        List<Laptop> laptopsByType = new ArrayList<>();
        if (laptops.size() == 0) {
            initAllLaptops(ctx);
        }
        for (Laptop h : laptops) {
            if (h.getTipe().equals(tipe)) {
                laptopsByType.add(h);
            }
        }
        return laptopsByType;
    }

}
