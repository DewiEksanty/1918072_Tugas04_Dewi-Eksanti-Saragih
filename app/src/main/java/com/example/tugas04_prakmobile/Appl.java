package com.example.tugas04_prakmobile;

public class Appl {
    private String nama,keterangan;
    private int logo;

    public Appl(String nama, String keterangan, int logo) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}