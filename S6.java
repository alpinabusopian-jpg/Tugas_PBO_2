package Prakk_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = in.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Jumlah bilangan harus lebih dari 0");
            }

            double[] angka = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Bilangan ke-" + (i + 1) + " : ");
                angka[i] = in.nextDouble();
                total += angka[i];
            }

            System.out.println("Rata-rata = " + (total / n));

        } catch (InputMismatchException e) {
            System.out.println("Kesalahan: input harus berupa angka!");
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan: akses indeks array di luar batas!");
        } finally {
            System.out.println("Program selesai.");
        }
    }
}
