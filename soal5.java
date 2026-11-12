package Prak_05;

public class soal5 {
    public static void main(String[] args) {
        int tinggi = 5;

    
        System.out.println("Half Triangle");
        for (int i = 1; i <= tinggi; i++) {
            for (int s = 1; s <= tinggi - i; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

       
        System.out.println("Full Triangle");
        for (int i = 1; i <= 5; i++) {
            int jumlahBintang = (i <= 3) ? 2 * i - 1 : 2 * (6 - i) - 1;
            int spasi = (5 - jumlahBintang) / 2;

            for (int s = 1; s <= spasi; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= jumlahBintang; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}