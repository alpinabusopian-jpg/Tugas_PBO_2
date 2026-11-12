package Prak_05;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan : ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            total += input.nextInt();
        }

        double rataRata = (double) total / n;

        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rataRata);
    }
}

