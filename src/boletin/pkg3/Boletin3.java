
package boletin.pkg3;

import java.util.Scanner;


public class Boletin3 {


    public static void main(String[] args) {
        Coche Tipo1 = new Coche();
        System.out.println(Tipo1.toString());
        Tipo1.setVelocidade(80);
        System.out.println(Tipo1.toString());
        Coche Tipo2=new Coche();
        Tipo2.acelerar(20);
        System.out.println(Tipo2.toString());
        Tipo2.frenar(15);
        System.out.println(Tipo2.toString());
}
    
}
