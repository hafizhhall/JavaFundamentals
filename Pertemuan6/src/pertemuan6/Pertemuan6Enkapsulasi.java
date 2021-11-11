/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM  :520031097
 */
public class Pertemuan6Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        Mahasiswa mah = new Mahasiswa();
        String umur, prodi, nama,nim;
        double ipk = 0;
        
        System.out.println("Inputkan Data Diri Anda");
        System.out.print("Nim anda : ");
        mah.setNim(nim = masukkan.nextLine());
        System.out.print("Nama anda : ");
        mah.setNama(nama = masukkan.nextLine());
        System.out.print("Prodi :");
        mah.setProdi(prodi = masukkan.nextLine());
         System.out.print("Umur Anda :");
        mah.setUmur(umur = masukkan.nextLine());
        System.out.print("IPK :");
        mah.setIpk(ipk = masukkan.nextDouble());
       
        
        System.out.println("\n\nData Diri Anda Berhasil Di Inputkan");
        mah.Namamhs();
        mah.Nimmhs();
        mah.Prodimhs();
        mah.Umurmhs();
        mah.Ipkmhs();
        
    }
    
}
