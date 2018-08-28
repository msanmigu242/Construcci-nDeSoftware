/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author milcam
 */

public class Transporte {
    public static void main(String[] args) 
    {
         Scanner teclado =  new Scanner(System.in);
            int kilos,kilometros,galonesgasolina;
            double bogotasasaina=80.2;
            int bogotasasaina1 = (int) bogotasasaina;
            int galonporkilometro= (bogotasasaina1 * 4);
            double pesomaximo=3.500;
                System.out.println("Ingrese el numero total de la carga a transportar en kilos: ");
                kilos =  teclado.nextInt();
                System.out.println("Ingrese el numero total de kilometros a recorrer: ");
                kilometros =  teclado.nextInt();
                System.out.println("Ingrese el numero total de la carga a transportar en kilos: ");
                galonesgasolina =  teclado.nextInt();
                if(kilos>pesomaximo){
                    
                }
                else
                {
                    
                }
    }
   
    
}
