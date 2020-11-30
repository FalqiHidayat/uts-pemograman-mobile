package com.electro.falqishoop.tipe;

public class Laptop {
    private String tipe;
    private String ras;
    private String harga;
    private String deskripsi;
    private int drawableRes;

    public Laptop(String tipe, String ras, String harga, String deskripsi, int drawableRes) {
        this.tipe = tipe;
        this.ras = ras;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
