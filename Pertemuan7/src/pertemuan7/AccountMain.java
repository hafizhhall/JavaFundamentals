/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class AccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            System.out.println("========================");
            System.out.println("====== Menu Login  =====");
            System.out.println("========================");
            System.out.println("1. Login Admin");
            System.out.println("2. Ubah Password");
            System.out.println("3. Create User");
            System.out.println("4. Lihat User");
            System.out.println("5. Keluar");
            System.out.println("========================");
            System.out.print("Masukan Pilihan         :");
            
            Account admin = new Account(); 
            Account hafizh = new Account();
            Integer code = sc.nextInt();
            
            switch(code){
                case 1:
                    System.out.print("Masukkan Username: ");
                    String userName = sc.next();
                    System.out.print("Masukkan Password: ");
                    String passWord = sc.next();
                    if (userName.equals("admin") && passWord.equals("admin")) {
                        admin.Login(userName, passWord);
                    }
                    else if(userName.equals("hafizh1") && passWord.equals("admin2")){
                        hafizh.Login(userName, passWord);
                    }else{
                        System.out.println("User dan Password anda Salah");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan Password Lama: ");
                    String passLama = sc.next();
                    System.out.print("Masukkan Password Baru: ");
                    String passBaru = sc.next();
//                    admin.UbahPass(passLama, passBaru);
                    hafizh.UbahPass(passLama, passBaru);
                    break;
                case 3:
                    System.out.print("Masukkan nama User: ");
                    String newUser = sc.next();
                    System.out.print("Masukkan Password   :");
                    String newPass = sc.next();
                    break;
                case 4:
                   
                    break;
                case 5:
                    System.exit(0);
                    break;
                    
            }
            
        }
    }
    
}
