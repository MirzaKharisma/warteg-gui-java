/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Login {

    public static void inisialisasidata() {
        try {
            File a = new File("data/data.txt");
            Scanner b = new Scanner(a);
            while (b.hasNextLine()) {
                pecah(b.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pecah(String data) {
        String user = "";
        int separatorKe = 0;
        int i = 0;
        String temporaryData = "";
        for (i = 0; i < data.length(); i++) {
            if (data.charAt(i) != '|') {
                temporaryData = temporaryData + data.charAt(i);
            } else {
                separatorKe = separatorKe + 1;
                if (separatorKe == 1) {
                    user = temporaryData;
                }

                temporaryData = "";
            }
        }
        User.pengguna.add(new User(user, temporaryData));

    }

    public boolean autentikasi(String user, String password) {
        int j = 0;
        for (int i = 0; i < User.pengguna.size(); i++) {
            if (User.pengguna.get(i).getUsername().equals(user) && User.pengguna.get(i).getPassword().equals(password)) {
                j++;
            } else {

            }
        }
        return j > 0 ? true : false;
    }
}
