/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3no1;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM  :5200311097
 */
public class Tugas3No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double berat,tinggi,BBI;
        berat = 0;
        BBI = 0;
        String gender;
        Scanner Inputan = new Scanner(System.in);
        
//        Sistem Inputan User
        System.out.print("Jenis Kelamin: ");
        gender = Inputan.nextLine();
        
//        Operasi
        switch (gender) {
            case "Pria":
            case "pria":
                System.out.print("Masukan Tinggi Badan anda (Centimeter)= ");
                tinggi = Inputan.nextDouble();
                System.out.print("Masukan Berat Badan anda (Kilogram)= ");
                berat = Inputan.nextDouble();
                BBI = ((tinggi - 100) - (tinggi - 100) * 0.1);
                System.out.println("Berat Badan Ideal Anda (Pria) : "+ BBI + " Kg");
                break;
            case "Wanita":
            case "wanita":
                System.out.print("Masukan Tinggi Badan anda (Centimeter)= ");
                tinggi = Inputan.nextDouble();
                System.out.print("Masukan Berat Badan anda (Kilogram)= ");
                berat = Inputan.nextDouble();
                BBI = ((tinggi - 100) - (tinggi - 100) * 0.15);
                System.out.println("Berat Badan Ideal Anda (Wanita) : "+ BBI + " Kg");
                break;
            default:
                System.out.println("Hasil Invalid");
                break;
        }
        if(berat>BBI){
            System.out.println("Maka Berat Badan Anda tidak Ideal");
        }
    }
    
}
