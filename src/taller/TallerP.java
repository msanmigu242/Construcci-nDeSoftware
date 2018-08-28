

package taller;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author milcam
 */
public class TallerP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner teclado =  new Scanner(System.in);
        float b, B, h, S1, S2, Ap, V, areaTronco;
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado del cuadrado superior: "));
        //System.out.println("Ingrese el valor del lado del cuadrado superior: ");
        //b =  teclado.nextFloat();
        B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado del cuadrado inferior: "));
        /*System.out.println("Ingrese el valor del lado del cuadrado inferior: ");
        B = teclado.nextFloat();*/
        h = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la altura de la base de la piramide: "));
        /*System.out.println("Ingrese el valor de la altura de la base de la piramide: ");
        h = teclado.nextFloat();*/
        S1 = (B * B);
        S2 = (b * b);
        Ap = (float) Math.sqrt((Math.pow(h, 2))+(Math.pow(((B/2)-(b/2)), 2)));
        areaTronco = (S1 + S2 + ((B + b) / 2) * Ap);
        JOptionPane.showMessageDialog(null, "El área del tronco es = " + areaTronco);
        //System.out.println("El área del tronco es = " + areaTronco);
        V = (float) ((h/3)*(S1 + S2 + (Math.sqrt(S1*S2))));
        JOptionPane.showMessageDialog(null, "El volumen del tronco de la piramide es = " + V);
        //System.out.println("El volumen de la piramide es = " + V);
    }
    
}