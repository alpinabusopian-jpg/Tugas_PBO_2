package Prakk_06;

import java.util.Arrays;
import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // a
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();
        int[] data = new int[n];

        // b
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + " : ");
            data[i] = in.nextInt();
        }

        // c
        int maks = data[0], min = data[0], idxMaks = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > maks) { maks = data[i]; idxMaks = i; }
            if (data[i] < min)  { min = data[i];  idxMin = i; }
        }
        System.out.println("\nNilai terbesar : " + maks + " (indeks " + idxMaks + ")");
        System.out.println("Nilai terkecil : " + min + " (indeks " + idxMin + ")");

        // d
        int total = 0;
        for (int x : data) total += x;
        double rata = (double) total / n;
        System.out.println("Jumlah semua   : " + total);
        System.out.println("Rata-rata      : " + rata);

        // e
        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2) jumlahGanjil += data[i];
        System.out.println("Jumlah elemen berindeks ganjil : " + jumlahGanjil);

        // f
        int jumlahGenap = 0;
        for (int i = 0; i < n; i += 2) jumlahGenap += data[i];
        System.out.println("Jumlah elemen berindeks genap  : " + jumlahGenap);

        // g
        String sifatE = (jumlahGanjil % 2 == 0) ? "GENAP" : "GANJIL";
        String sifatF = (jumlahGenap % 2 == 0) ? "GENAP" : "GANJIL";
        System.out.println("Hasil penjumlahan indeks ganjil (e) bernilai " + sifatE);
        System.out.println("Hasil penjumlahan indeks genap (f) bernilai " + sifatF);

        // h
        Arrays.sort(data);
        System.out.println("Array setelah diurutkan : " + Arrays.toString(data));
    }
}

