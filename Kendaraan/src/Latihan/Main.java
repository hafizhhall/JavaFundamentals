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
public class Main {
    public static void main(String[] args) {
         Kendaraan kendaraan1 = new Kendaraan();
        Kendaraan kendaraan2 = new Kendaraan();
        Kendaraan kendaraan3 = new Kendaraan();

//        Objek1
        kendaraan1.setJenis("Mobil");
        kendaraan1.setMerek("Daihatsi Espass");
        kendaraan1.setHarga(12000079);

//        objek2
        kendaraan2.setJenis("Motor");
        kendaraan2.setMerek("Honda Astrea 110cc");
        kendaraan2.setHarga(6350000);

//        Objek3
        kendaraan3.setJenis("Motor");
        kendaraan3.setMerek("Supra");
        kendaraan3.setHarga(1200000);

        kendaraan1.tampilData();
        kendaraan1.hitungHarga();

        kendaraan2.tampilData();
        kendaraan2.hitungHarga();

        kendaraan3.tampilData();
        kendaraan3.hitungHarga();
    }
}
