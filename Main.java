package pertemuan3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in); 
        
       String nama,npm,alamat;
        System.out.println("==========NO 1==========");
        System.out.println("Nomer Induk Karyawan : ");
        nama = input.nextLine();
        
        System.out.println("Nama Karyawan : ");
        npm = input.nextLine();
        
        System.out.println("Alamat : ");
        alamat = input.nextLine();
        
        String jabatan = "Manajer";
        int b1 = 2000000;
        int b2 = 300000;
        int b3 = 200000;
        int b4 = 150000;
        
        int totalGaji = b1 + b2 + b3 + b4;
        double PajakPenghasilan = (b1+b2+b4 * 10 /100);
        double gajiBersih = totalGaji - PajakPenghasilan;
        
        System.out.println("jabatan : "+ jabatan);
        System.out.println("Gaji Pokok (b1) : "+ b1);
        System.out.println("Tunjangan Jabatan (b2) : "+ b2);
        System.out.println("Tunjangan Istri (b3) : "+ b3);
        System.out.println("Tunjangan Anak (b4) : "+ b4);
        System.out.println("Total Gaji : "+ totalGaji);
        System.out.println("Pajak Penghasilan : "+ PajakPenghasilan);
        System.out.println("Gaji Bersih : "+ gajiBersih);
        System.out.println(nama);
        
    }
    
}
