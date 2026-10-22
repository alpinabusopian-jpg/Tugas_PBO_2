package pertemuan3;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukan Nilai A :");
        double a = input.nextDouble();
        
        System.out.println("Masukan Nilai P :");
        double p = input.nextDouble();
        
        System.out.println("Masukan Nilai S :");
        double s = input.nextDouble();
        
        System.out.println("A : "+ a);
        System.out.println("P : "+ p);
        System.out.println("S : "+ s);
        
        double u = (a * (p*p))/s;
        
        System.out.println("Hasil : "+ u);
    }
}
