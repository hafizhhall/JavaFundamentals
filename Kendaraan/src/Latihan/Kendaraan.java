/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Acer
 * NPM  :5200311097
 * Nama :Hafizh Athallah Widianto
 */
public class Kendaraan {
    public String jenis;
    public double harga;
    public String merek;

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    void tampilData(){
        System.out.println("\nJenis Kendaraan: " + this.getJenis());
        System.out.println("Merek Kendaraan: " + this.getMerek());
        System.out.println("Harga Kendaraan: " + this.getHarga());
    }
    void hitungHarga(){
        double harga1 = 0.1;
        harga = harga * harga1;
        System.out.println("Jumlah ppn10% yang harus dibayarkan: " +harga);
    }
}
