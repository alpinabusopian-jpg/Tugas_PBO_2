package Prakk_06;

import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah baris  : ");
        int baris = in.nextInt();
        System.out.print("Jumlah kolom  : ");
        int kolom = in.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = in.nextInt();
            }

        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = in.nextInt();
            }

        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("\nHasil A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++)
                System.out.print(C[i][j] + "\t");
            System.out.println();
        }
    }
}
