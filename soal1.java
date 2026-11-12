package Prak_05;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan ke-1 : ");
        int angka = input.nextInt();
        int terbesar = angka;
        int terkecil = angka;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }
            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}

