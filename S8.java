package Prakk_06;

import java.util.Scanner;
class ThreadAnak extends Thread {
    private final int nomor;

    ThreadAnak(int nomor) {
        super("Thread-Anak-" + nomor);
        this.nomor = nomor;
    }

    @Override
    public void run() {
        System.out.println(getName() + " (anak ke-" + nomor + ") berjalan");
    }
}

public class S8 {
    public static void main(String[] args) throws InterruptedException {
        // Thread utama (main)
        Scanner in = new Scanner(System.in);
        System.out.println("Thread utama: " + Thread.currentThread().getName());

        System.out.print("Masukkan jumlah thread anak yang diinginkan: ");
        int n = in.nextInt();

        ThreadAnak[] anak = new ThreadAnak[n];
        for (int i = 0; i < n; i++) {
            anak[i] = new ThreadAnak(i + 1);
            anak[i].start();
        }
        for (ThreadAnak t : anak) {
            t.join();
        }

        System.out.println("Semua thread anak selesai. Threas beres.");
    }
}