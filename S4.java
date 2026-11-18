package Prakk_06;

import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = in.nextInt();
        in.nextLine();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + " : ");
            nama[i] = in.nextLine();
            System.out.print("Nilai                : ");
            nilai[i] = in.nextInt();
            in.nextLine();

            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\n================ Daftar Nilai Mahasiswa ================");
        System.out.printf("%-4s %-20s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-20s %-8d %-12s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
    }
}

