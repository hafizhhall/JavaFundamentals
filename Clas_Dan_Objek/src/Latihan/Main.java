/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author Acer
 * NPM  :5200311097
 * Nama :Hafizh Athallah Widianto
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
//            Nama Kelas nama objek baru keyword
    Tabungan tabungan_mhsl = new Tabungan();
    Tabungan tabungan_mhs2 = new Tabungan();
    int jumlah;
//        Set nilai saldo awal
    tabungan_mhsl.saldo = 1000000;
        System.out.println("Saldo anda sekarang adalah  " + tabungan_mhsl.saldo);
//    Jumlah masukan saldo baru
        System.out.print("Masukan nominal uang anda  ");
    tabungan_mhsl.menabung(jumlah = inputan.nextInt());
//    mengambil uang
       
            System.out.print("Anda mengambil uang dengan nominal  ");
            tabungan_mhsl.ambilUang(jumlah = inputan.nextInt());
       
    
    
    
//Tabungan[] inimerupakancontoh_penggunaan_array_objek = new Tabungan[3];
//
//inimerupakancontoh_penggunaan_array_objek[0] = new Tabungan();
//inimerupakancontoh_penggunaan_array_objek[1] = new Tabungan();
//inimerupakancontoh_penggunaan_array_objek[2] = new Tabungan();
//
//inimerupakancontoh_penggunaan_array_objek[0].saldo=12000;
//inimerupakancontoh_penggunaan_array_objek[1].saldo=1000;
//inimerupakancontoh_penggunaan_array_objek[2].saldo=1200;
//
//for (int i =0;i<3; i++){
//        inimerupakancontoh_penggunaan_array_objek[i].cekSaldo();
//    }
    }
}
