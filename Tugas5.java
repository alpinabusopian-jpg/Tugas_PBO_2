package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas5 {
    public static void main(String[] args) throws IOException{
       BufferedReader cp = new BufferedReader(
       new InputStreamReader (System.in));
        System.out.print("Masukkan Jumlah Buah Mangga: ");
        int mangga = Integer.parseInt(cp.readLine());

        System.out.print("Masukkan Jumlah Buah Jambu yang di bagikan ke tetangga: ");
        int jambu = Integer.parseInt(cp.readLine());

        System.out.print("Masukkan Jumlah Tetangga yang di bagi: ");
        int tetangga = Integer.parseInt(cp.readLine());

        System.out.print("Masukkan Jumlah Buah Mangga yang Busuk: ");
        int busuk = Integer.parseInt(cp.readLine());

        jambu *= tetangga; 
        mangga -= busuk;   

        int total = mangga + jambu; 

        System.out.println("Total Buah Ada " + total);
    }
}
    

