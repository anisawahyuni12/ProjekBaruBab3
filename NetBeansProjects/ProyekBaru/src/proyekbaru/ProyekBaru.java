/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyekbaru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ProyekBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //  TODO code application logic here
// System.out.print("hallo dunia");
// System.out.println(2+" "+5);
//     System.out.println(2+5);
//     System.out.println("Angka "+" "+5);
//     System.out.println("2 + 5"+" = "+2+5);
//      System.out.println("2 + 5"+" = "+(2+5));
//String namaDepan = "";
//String namaBelakang = "";
////buat objek dari inputStream
//InputStreamReader ireader =
//new InputStreamReader(System.in);
////buat objek bufferreader
//BufferedReader breader =
//new BufferedReader(ireader);
//System.out.println("Nama Depan : ");
////membaca inputan user
//namaDepan =
//breader.readLine();
//System.out.println("Nama Belakang : ");
////membaca inputan user
//namaBelakang =
//breader.readLine();
//System.out.println("Nama Saya adalah :");
//System.out.println(namaDepan + " " +
//namaBelakang);

//String namaDepan = "";
//String namaBelakang = "";
////buat objek dari inputStream
//InputStreamReader ireader =
//new InputStreamReader(System.in);
////buat objek bufferreader
//BufferedReader breader =
//new BufferedReader(ireader);
//System.out.println("Nama Depan : ");
////membaca inputan user
//namaDepan =
//breader.readLine();
//System.out.println("Nama Belakang : ");
////membaca inputan user
//namaBelakang =
//breader.readLine();
//System.out.println("Nama Saya adalah :");
//System.out.println(namaDepan + " " +
//namaBelakang);

//String nama =
//JOptionPane.showInputDialog("Masukan Nama:");
//System.out.println("Nama : "+nama);

//String a =
//JOptionPane.showInputDialog("Masukan nilaiuntuk variabel a : ");
//
//String b =
//JOptionPane.showInputDialog("Masukan nilaiuntuk variabel b : ");
//
//System.out.println("Hasil :" +
//(Integer.parseInt(a) *
//Integer.parseInt(b)));

//String nama = "anisa";
//String jurusan = "Pengembangan Prangkat lunak dan Gim";
//JOptionPane.showMessageDialog(null, "Halo " + nama
//+ ",jurusan Kamu " + jurusan);

//JOptionPane.showMessageDialog(
//null, "Sebuah Plain Message.","Plain Message",
//JOptionPane.PLAIN_MESSAGE);

int pertanyaan =
JOptionPane.showConfirmDialog(null, "Pilih Yes atau No?", "Pertanyaan",JOptionPane.YES_NO_OPTION);

if(JOptionPane.YES_OPTION == pertanyaan){
JOptionPane.showMessageDialog(null, "Kamu memilih Yes.");
}else if(JOptionPane.NO_OPTION == pertanyaan){
JOptionPane.showMessageDialog(null, "Kamu memilih No.");
}
    }
    
}
