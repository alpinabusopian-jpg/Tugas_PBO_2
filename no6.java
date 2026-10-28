package PRAK_04;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char member = input.next().toLowerCase().charAt(0);
        System.out.print("Total belanja (Rp): ");
        double total = input.nextDouble();
        System.out.print("Uang yang diberikan (Rp): ");
        double uang = input.nextDouble();

        double diskon = 0;

        if (member == 'y') {
            if (total > 500000) {
                diskon = 50000;
            } else if (total > 100000) {
                diskon = 15000;
            }
        } else {
            if (total > 100000) {
                diskon = 10000;
            }
        }

        double bayar = total - diskon;

        System.out.println("\nTotal Belanja : Rp" + String.format("%,.0f", total));
        System.out.println("Diskon        : Rp" + String.format("%,.0f", diskon));
        System.out.println("Harus Dibayar : Rp" + String.format("%,.0f", bayar));

        if (uang >= bayar) {
            System.out.println("Uang Diberikan: Rp" + String.format("%,.0f", uang));
            System.out.println("Kembalian     : Rp" + String.format("%,.0f", uang - bayar));
        } else {
            System.out.println("Uang kurang Rp" + String.format("%,.0f", bayar - uang));
        }
    }
}

