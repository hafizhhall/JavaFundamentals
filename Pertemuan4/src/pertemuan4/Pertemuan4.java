/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author Acer
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Contoh Penerapan Percabangan if
        int nilai=9;
        
        if(nilai==5){
            System.out.println("Statement/Nilai yang anda masukkan benar bernilai 5");
        } 
        else if(nilai ==8){
            System.out.println("Statement/Nilai yang anda masukkan benar bernilai 8");
        }
        else if(nilai == 11){
            System.out.println("Statement/Nilai yang anda masukkan benar bernilai 11");
        }
        else{
            System.out.println("Nilai tidak ditemukan");
        }
    }
    
}
