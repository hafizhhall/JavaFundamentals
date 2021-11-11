/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2no1;
import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM  :5200311097
 */
public class Tugas2No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objek
        Scanner input = new Scanner(System.in);
        
        //Variabel
        String barang;
        double disc, harga,a,b;
        
        System.out.println("====Program Menghitung Diskon 25%====");
        System.out.print("Nama Barang = ");
        barang = input.nextLine();
        System.out.println("=====================================");
        System.out.print("Harga Barang: Rp ");
        harga = input.nextDouble();
        
        System.out.println("Subtotal = " + harga);
        System.out.println("Discount 25%");
        a = harga * 0.25;
        b = harga - a;
        System.out.println("=====================================");
        System.out.println("Jumlah akhir: Rp " + b);
        
        
    }
    
}
