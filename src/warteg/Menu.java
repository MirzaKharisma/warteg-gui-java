/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class Menu {
    private String kode_makanan;
    private String nama_makanan;
    private int jumlah;
    private int harga;
    private int total;
    
    public static ArrayList<Menu> menu = new ArrayList<>(); 

    public Menu(String kode_makanan, String nama_makanan, int jumlah, int harga, int total) {
        this.kode_makanan = kode_makanan;
        this.nama_makanan = nama_makanan;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
    }

    public String getKode_makanan() {
        return kode_makanan;
    }

    public void setKode_makanan(String kode_makanan) {
        this.kode_makanan = kode_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
