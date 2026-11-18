package Prakk_06;

public class S2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota";   // nilai baru
                System.out.println("Indeks yang diubah : " + i);
                System.out.println("Nilai baru         : " + mobil[i]);
            }
        }

        System.out.println("\nIsi array sekarang:");
        for (String m : mobil) {
            System.out.println(m);
        }
    }
}

