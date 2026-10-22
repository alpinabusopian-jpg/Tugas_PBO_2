package pertemuan3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tugas7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = Integer.parseInt(br.readLine());

        System.out.print("Masukkan tebal lembar per novel: ");
        int tebalLembar = Integer.parseInt(br.readLine());

        long totalLembar = (long) jumlahNovel * tebalLembar;

        long totalDetik = totalLembar;

        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n=== Hasil Perhitungan Waktu Cetak ===");
        System.out.println("Total lembar yang dicetak : " + totalLembar + " lembar");
        System.out.println("Waktu yang diperlukan     : " + hari + " hari, " 
                           + jam + " jam, " + menit + " menit, " + detik + " detik.");
    }
}

