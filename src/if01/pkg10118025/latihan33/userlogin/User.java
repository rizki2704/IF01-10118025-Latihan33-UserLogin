/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan33.userlogin;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class User {
    private String username, password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        username = "RizkiAdam";
        password = "terbaikselalu";
        
        statusAkun = parUserName.equals(username) && parPassword.equals(password);
        return statusAkun;
    }
    
    private void hasilLogin(boolean statusAkun, String parUserName){
        if(statusAkun == true){
            System.out.printf("\n*****Hallo %s*****", parUserName.toUpperCase());
            System.out.println("\nSelamat Datang di Aplikasi Ini");
        }else{
            System.out.println("\nOoops, username atau password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
    
}
