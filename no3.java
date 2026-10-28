package PRAK_04;
 import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NIK            : ");
        String nik = input.nextLine();
        System.out.print("Nama           : ");
        String nama = input.nextLine();
        System.out.print("Kode Golongan (1-4): ");
        int kode = input.nextInt();
        System.out.print("Status Pernikahan (Menikah/Belum menikah/Cerai/Menikah dan punya anak): ");
        input.nextLine();
        String status = input.nextLine();
        System.out.print("Jumlah Anak    : ");
        int jmlAnak = input.nextInt();

        double gajiPokok;
        switch (kode) {
            case 1:  gajiPokok = 1200000; break;
            case 2:  gajiPokok = 1500000; break;
            case 3:  gajiPokok = 1750000; break;
            case 4:  gajiPokok = 2000000; break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        double tunjPasangan = 0;
        if (kode == 1 || kode == 4) {
            tunjPasangan = 0.10 * gajiPokok;
        }

        double tunjAnak = 0;
        if (kode == 4) {
            tunjAnak = 0.05 * gajiPokok * jmlAnak;
        }

        double gajiBersih = gajiPokok + tunjPasangan + tunjAnak;

        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Kode Golongan      : " + kode);
        System.out.println("Status             : " + status);
        System.out.println("Jumlah Anak        : " + jmlAnak);
        System.out.println("Gaji Pokok         : Rp" + String.format("%,.0f", gajiPokok));
        System.out.println("Tunjangan Pasangan : Rp" + String.format("%,.0f", tunjPasangan));
        System.out.println("Tunjangan Anak     : Rp" + String.format("%,.0f", tunjAnak));
        System.out.println("Gaji Bersih        : Rp" + String.format("%,.0f", gajiBersih));
    }
}

