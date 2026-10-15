package Segitiga;

/**
 *
 * @author alpin
 */
public class Segitiga {
    double a;
    double b;
    double c;
    double keliling;
    double luas;
    
    void Hitung(){
    luas =0.5 *a*b;
        System.out.println("luas :"+ luas);
    }
    void Keliling(){
    c = Math.sqrt((a*a) + (b*b));
    keliling = a+b+c;
        System.out.println("keliling :"+ keliling);
    
    
    }
}
