/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Warteg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormLogin login = new FormLogin();
        login.show();
//        Scanner a = new Scanner (System.in);
//        Login.inisialisasidata();
//        boolean lanjut = true;
//        do{
//            System.out.println("Masukkan Username : ");
//            String username = a.nextLine();
//            System.out.println("Masukkan Password : ");
//            String password = a.nextLine();
//            Login b = new Login();
//            if (b.autentikasi(username, password)){
//                break;
//            }else {
//                System.out.println("Username / Password salah");
//            }
//        }while (lanjut);
    }
    
}
