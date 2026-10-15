/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segitiga;

/**
 *
 * @author alpin
 */
public class KonversiSuhu {
    double c;
    double f;
    double r;
    void Suhu(){
    System.out.println("celcius -> fahrenheit : " + ((c * 9 / 5 ) + 32));
        System.out.println("fahrenheit -> celcius : " + ((f - 32) * 5 / 9));
        System.out.println("celcius -> reamur : " + (c * 4 / 5));
        System.out.println("reamur -> celcius : " + (r * 5 / 4));
        System.out.println("fahrenheit -> reamur : " + ((f - 32) * 4 / 9));
        System.out.println("reamur -> fahrenheit : " + ((r * 9 / 4) + 32));
        
    }
}
