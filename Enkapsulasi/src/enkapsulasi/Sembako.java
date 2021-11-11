/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author Acer
 */
public class Sembako {
    private String nama;
    private int harga;
    private int jumlah;
    public String getNama() {
        return nama;

    }
    public void setNama(String nama) {
        if(nama.equals("1")){
            harga = 35000;
        }else if(nama.equals("2")){
            harga = 12500;
        }else if (nama.equals("3")){
            harga = 16000;
        }else if (nama.equals("4")){
            harga = 19000;
        }else {
            System.out.println("Missing Value");
        }
        this.nama = nama;
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
    public void setHarga() {
        harga = harga*jumlah;
        System.out.println("Harga Sub Total: " + harga);
        if(getHarga() >= 90000){
            int harga1 = (int) (harga*0.2);
            harga = harga -harga1;
            System.out.println("Selamat anda mendapatkan diskon 20%!!!");
        }
        this.harga = harga;
        getJumlah();
//      getNama();
    }
    void hargaTotal(){
        System.out.println("Harga total belanjaan anda: " +this.harga);
    }
    
}
