package Prakk_06;

class ThreadWeb extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " sedang berjalan, hitungan ke-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu: " + e.getMessage());
            }
        }
        System.out.println(getName() + " selesai.");
    }
}

public class S7 {
    public static void main(String[] args) {
        ThreadWeb t = new ThreadWeb();   
        t.start();                        
    }
}
