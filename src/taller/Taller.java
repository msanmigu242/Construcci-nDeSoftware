

package taller;

import java.util.Scanner;
class Taller {

   
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
       float b, B, h, S1, S2, Ap, V, areaTronco;
        System.out.println("Ingrese el valor del lado del cuadrado superior: ");
        b =  teclado.nextFloat();
        System.out.println("Ingrese el valor del lado del cuadrado inferior: ");
        B = teclado.nextFloat();
        System.out.println("Ingrese el valor de la altura de la base de la piramide: ");
        h = teclado.nextFloat();
        S1 = (B * B);
        S2 = (b * b);
        Ap = (float) Math.sqrt((Math.pow(h, 2))+(Math.pow(((B/2)-(b/2)), 2)));
        areaTronco = (S1 + S2 + ((B + b) / 2) * Ap);
        System.out.println("El área del tronco es = " + areaTronco);
        V = (float) ((h/3)*(S1 + S2 + (Math.sqrt(S1*S2))));
        System.out.println("El volumen del tronco de la piramide es = " + V);
    }
    
}
