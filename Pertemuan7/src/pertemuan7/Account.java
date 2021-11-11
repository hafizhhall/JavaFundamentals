/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author Acer
 */
public class Account {
    String username;
    String Password;
    
    public Account(){
    username = "admin";
    Password = "admin";
    username = "hafizh1";
    Password = "admin2";
}
    
    public Account(String ParUsername, String ParPassword){
         this.username = ParUsername;
         this.Password = ParPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
//    method yang digunakan untuk proses login
    public void Login(String username, String password){
        if (username.equals(this.username) && password.equals(this.Password)) {
            System.out.println("Login Berhasil !!!");
        } else {
            System.out.println("Login Gagal!!!");
        }
       
    }
    public void UbahPass(String passLama, String passBaru){
        if (passLama.equals(this.Password)) {
            setPassword(passBaru);
            System.out.println("Password berhasil diganti!!!");
        } else {
            System.out.println("Password gagal diganti!!!");
        }
    }
    public void createUser(String newUser, String newPass){
        if (newUser.equals(this.Password)) {
            setPassword(newUser);
            System.out.println("Password & User berhasil Dibuat!!!");
        } else {
            System.out.println("Password & User gagal diganti!!!");
        }
    }
}
