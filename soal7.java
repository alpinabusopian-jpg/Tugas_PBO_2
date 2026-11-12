package Prak_05;

public class soal7 {
    public static void main(String[] args) {
        // Post-increment (i++): nilai dipakai dulu, baru ditambah 1
        int i = 0;
        System.out.println("Menggunakan i++");
        while (i < 5) {
            System.out.println(i++);   // tampil 0 1 2 3 4
        }

        System.out.println();

        // Pre-increment (++i): ditambah 1 dulu, baru nilainya dipakai
        int j = 0;
        System.out.println("Menggunakan ++i");
        while (j < 5) {
            System.out.println(++j);   // tampil 1 2 3 4 5
        }
    }
}
