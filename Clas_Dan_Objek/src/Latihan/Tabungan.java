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
public class Tabungan {
    public int saldo;
    
//    Metod untuk menabung
    public void menabung(int jumlah){
        System.out.println("Anda menabung dengan nominal : " + jumlah);
        
        saldo = saldo + jumlah;
        cekSaldo();
    }
//    method untuk memproses pengambilan uang
    public void ambilUang(int jumlah){
        saldo = saldo-jumlah;
        ambilUang();
    }
//    method cek saldo 
    void cekSaldo(){
        System.out.println("Jumlah Saldo anda sekarang adalah " + saldo);
    }
    
//    method ambil uang
    void ambilUang(){
        System.out.println("Saldo Anda Sekarang Adalah  " + saldo);
    }
    
}
