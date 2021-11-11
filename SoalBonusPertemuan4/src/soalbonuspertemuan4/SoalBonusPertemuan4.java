/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalbonuspertemuan4;
import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM  :5200311097
 */
public class SoalBonusPertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double berat,tinggi;
        String gender;
        Scanner Inputan = new Scanner(System.in);
        
//        Sistem Inputan User
        System.out.print("Jenis Kelamin: ");
        gender = Inputan.nextLine();
        
//        Operasi
         if(gender.equals("Pria") || gender.equals("pria")){
             System.out.print("Masukan Tinggi Badan anda (Centimeter)= ");
        tinggi = Inputan.nextDouble();
        System.out.println("Berat Badan Ideal Pria: "+ ((tinggi - 100) - (tinggi - 100) * 0.1) + " Kg");
         }
         else if(gender.equals("Wanita")|| gender.equals("wanita")){
             System.out.print("Masukan Tinggi Badan anda (Centimeter)= ");
        tinggi = Inputan.nextDouble();
         System.out.println("Berat Badan Ideal Wanita: "+ ((tinggi - 100) - (tinggi - 100) * 0.15) + " Kg");
         }
         else{
             System.out.println("Hasil Invalid");
         }
        
        
        
        
        
        
    }
    
}
