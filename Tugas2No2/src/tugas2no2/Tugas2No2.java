/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2no2;

/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM  :5200311097
 */
public class Tugas2No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================================================");
        System.out.println("Mata Kuliah                     ||  SKS   || Nilai");
        System.out.println("--------------------------------------------------");
        System.out.println("Kalkus 1                        ||   3    ||  B");
        System.out.println("Bahasa Indonesia                ||   2    ||  B");
        System.out.println("Bahasa Inggris I                ||   2    ||  A");
        System.out.println("Fisika I                        ||   3    ||  C");
        System.out.println("Pemrograman Dasar               ||   4    ||  A");
        System.out.println("Aplikasi Teknologi Informasi    ||   4    ||  A");
        System.out.println("==================================================");

        double nilai;
        int sks, jumlah;
        sks = 3+2+2+3+4+4;
        jumlah = 3+3+4+1+4+4;
        System.out.println("Jumlah SKS                       =  " + sks);
        System.out.println("Jumlah Bobot Nilai               =  " + jumlah);

        nilai = (sks*jumlah) / sks;
        System.out.println("IPK Mahasiswa                    = " +nilai);
    }
    
}
