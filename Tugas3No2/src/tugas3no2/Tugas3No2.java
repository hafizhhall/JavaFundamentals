/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3no2;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM  :5200311097
 */
public class Tugas3No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner UserInput = new Scanner(System.in);
        
        
        System.out.print("Nilai a = ");
        int a = UserInput.nextInt();
        
        System.out.print("Nilai b = ");
        int b = UserInput.nextInt();
       
        System.out.print("Bilangan Genap = ");
        for(a = a; a <= b; a++){
            if(a%2 == 0){
                System.out.print(a+", ");
            }
        }
    }
}
