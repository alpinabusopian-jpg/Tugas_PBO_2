package pertemuan3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Masukkan Waktu Pertama ===");
        System.out.print("Jam   : ");
        int jam1 = Integer.parseInt(br.readLine());
        System.out.print("Menit : ");
        int menit1 = Integer.parseInt(br.readLine());
        System.out.print("Detik : ");
        int detik1 = Integer.parseInt(br.readLine());

        System.out.println("\n=== Masukkan Waktu Kedua ===");
        System.out.print("Jam   : ");
        int jam2 = Integer.parseInt(br.readLine());
        System.out.print("Menit : ");
        int menit2 = Integer.parseInt(br.readLine());
        System.out.print("Detik : ");
        int detik2 = Integer.parseInt(br.readLine());

        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisihDetik = Math.abs(totalDetik1 - totalDetik2);

        int selisihJam = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int selisihMenit = sisaDetik / 60;
        int selisihDetikAkhir = sisaDetik % 60;

        System.out.println("\n----------------------------------------");
        System.out.println("Selisih Waktu: " + selisihJam + " jam, " + 
                           selisihMenit + " menit, " + selisihDetikAkhir + " detik.");
        System.out.println("----------------------------------------");
    }
}

