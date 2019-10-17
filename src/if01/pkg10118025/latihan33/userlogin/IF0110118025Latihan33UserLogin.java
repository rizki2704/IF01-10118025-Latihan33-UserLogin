/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan33.userlogin;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan33UserLogin {

    private static String uname, pass;
    
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Username anda\t: ");
        uname = scan.next();
        System.out.print("Masukkan Password\t: ");
        pass = scan.next();
        
        user.pengecekkanLogin(uname, pass);
        
    }
    
}
