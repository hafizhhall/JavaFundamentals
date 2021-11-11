/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;
import java.util.Scanner;
/**
 *
 * @author Acer
 * NPM  :5200311097
 * Nama :Hafizh Athallah Widianto
 */
public class Main {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
       //        Deklarasi Variabel
        String nama;
        int jumlah;
        int harga = 0;

//        Objek
        Sembako sm = new Sembako();

        System.out.println("===============================================");
        System.out.println("Ketersediaan Sembako di Toko Maju-Maju: ");
        System.out.println("        Nama Sembako         |  Harga Sembako");
        System.out.println(" 1. Minyak Goreng Bimoli 2L  |    Rp35.000");
        System.out.println(" 2. Gula Pasir/1kg           |    Rp12.500");
        System.out.println(" 3. Telur/1kg                |    Rp16.000");
        System.out.println(" 4. Bawang Bombay/1kg        |    Rp19.000");
        System.out.println("===============================================");
        System.out.println("");
        System.out.print("Pilih Nomor Nama Sembako: ");

        sm.setNama(nama = masukkan.nextLine());
        System.out.print("Jumlah Item: ");
        sm.setJumlah(jumlah = masukkan.nextInt());
        sm.setHarga();
//        sm.setHarga(harga);
        sm.hargaTotal();
    }
}
