package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) throws IOException{
        BufferedReader px = new BufferedReader (
        new InputStreamReader (System.in));
        
        System.out.println("Masukan Nama : ");
        String nama = px.readLine();
        
        System.out.println("Masukan Umur : ");
        int umur = Integer.parseInt(px.readLine());
        System.out.println("");
        
        System.out.println("Nama : "+ nama );
        System.out.println("Umur : "+ umur );
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Nama : ");
        String name = input.nextLine();
        
        System.out.println("Masukan Umur : ");
        int age = input.nextInt();
        
        System.out.println("Nama : "+ name);
        System.out.println("Umur : "+ age);
    }
}
