package pertemuan3;

import java.io.*;

public class Tugas2 {
    public static void main(String[] args) throws FileNotFoundException ,IOException {
        DataOutputStream output = new DataOutputStream (
        new FileOutputStream("Pembelajaan.txt"));
        
        output.writeUTF("Alpin AS");
        output.writeInt(200000);
        output.writeInt(50);
        output.writeInt(300000);
        output.close();
        
        DataInputStream input = new DataInputStream(
        new FileInputStream ("pembelajaan.txt"));
        
        String nama = input.readUTF();
        int totalBelanja = input.readInt();
        int diskon = input.readInt();
        int bayar = input.readInt();
        
        float total = totalBelanja - ((totalBelanja * diskon) /100);
        float kembalian = bayar - total;
        
        System.out.println("Nama : "+ nama);
        System.out.println("Total Belanja : "+ totalBelanja);
        System.out.println("Diskon (%) : "+ diskon);
        System.out.println("Total : "+ total);
        System.out.println("Bayar : "+ bayar);
        System.out.println("Kembalian : "+ kembalian);
    }
}
