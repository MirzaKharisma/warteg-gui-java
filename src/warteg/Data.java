/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Data {
    public static void inisialisasidata() {
        try {
            File a = new File("data/menu.txt");
            Scanner b = new Scanner(a);
            while (b.hasNextLine()) {
                pecah(b.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pecah(String data) {
        String kode = "";
        String nama = "";
        int jumlah = 0;
        int harga = 0;
        int total = 0;
        int separatorKe = 0;
        int i = 0;
        String temporaryData = "";
        for (i = 0; i < data.length(); i++) {
            if (data.charAt(i) != '|') {
                temporaryData = temporaryData + data.charAt(i);
            } else {
                separatorKe = separatorKe + 1;
                if (separatorKe == 1) {
                    kode = temporaryData;
                }else if (separatorKe == 2) {
                    nama = temporaryData;
                }else if (separatorKe == 3){
                    jumlah = Integer.parseInt(temporaryData);
                }else if (separatorKe == 4){
                    harga = Integer.parseInt(temporaryData);
                }

                temporaryData = "";
            }
        }
        Menu.menu.add(new Menu(kode, nama, jumlah, harga, Integer.parseInt(temporaryData)));

    }
    public static void writeFile(){
        try{
        FileWriter data = new FileWriter ("data//menu.txt");
            for (int i = 0; i < Menu.menu.size(); i++) {
                data.write(Menu.menu.get(i).getKode_makanan()+"|"+
                        Menu.menu.get(i).getNama_makanan()+"|"+
                        Menu.menu.get(i).getJumlah()+"|"+
                        Menu.menu.get(i).getHarga()+"|"+
                        Menu.menu.get(i).getTotal());
                data.write(System.getProperty("line.separator"));
                
            }
            data.flush();
            data.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
