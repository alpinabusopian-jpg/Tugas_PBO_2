/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segitiga;

/**
 *
 * @author alpin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----01-----");
        int x = 5;
        System.out.println("Nilai awal: " + x);
        x++;
        System.out.println("Setelah increment: " + x);
        
        System.out.println("-----02-----");
        persegi_panjang hp = new persegi_panjang();
        hp.HitungPP();
        
        System.out.println("-----03-----");
        PersamaanKuadrat ps = new PersamaanKuadrat();
        ps.a =2;
        ps.b = 10;
        ps.c =5;
        ps.pkuadrat();
        
        System.out.println("-----04-----");
        OperasiMatematika sa = new OperasiMatematika();
        sa.x =22;
        sa.y =33;
        sa.Mtk();
        
        System.out.println("-----05-----");
        Segitiga hs = new Segitiga();
        hs.a = 6;
        hs.b = 8;
        hs.Hitung();
        
        System.out.println("-----06-----");
        Segitiga cs = new Segitiga();
        cs.a = 6;
        cs.b = 8;
        cs.Keliling();
        
        System.out.println("-----07-----");
        String a = "saya belajar java";
        String b = "saya belajar java";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        
        System.out.println("-----08-----");
        double jarakbulan =384400;
        double jarakmatahari =152100000;
        double kecepatancahaya =300000;
        double waktubulan =jarakbulan/kecepatancahaya;
        double waktumatahari =jarakmatahari/kecepatancahaya;
        System.out.println("jarak waktu bumi ke bulan :"+ waktubulan + "detik");
        System.out.println("jarak waktu bumi ke matahari :"+ waktumatahari + "detik");
        
        System.out.println("-----0 9-----");
        KonversiSuhu da = new KonversiSuhu();
        da.c = 10;
        da.f =15;
        da.r =5;
        da.Suhu();
        
    }
}
