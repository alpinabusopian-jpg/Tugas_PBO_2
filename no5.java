package PRAK_04;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan hasil penjualan hari ini (Rp): ");
        double penjualan = input.nextDouble();

        double uangJasa, komisi;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double pendapatan = uangJasa + komisi;

        System.out.println("\nPenjualan    : Rp" + String.format("%,.0f", penjualan));
        System.out.println("Uang Jasa    : Rp" + String.format("%,.0f", uangJasa));
        System.out.println("Komisi       : Rp" + String.format("%,.0f", komisi));
        System.out.println("Pendapatan   : Rp" + String.format("%,.0f", pendapatan));
    }
}

