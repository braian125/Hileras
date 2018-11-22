package hileras;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian Vanegas
 */
public class Hilera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String texto;
        char aCar;
        int i = 0;

        ListaHileraDoble hilera = new ListaHileraDoble();

        texto = JOptionPane.showInputDialog(null, "Ingrese texto para crear la hilera", "Crear Hilera", JOptionPane.INFORMATION_MESSAGE);

        while (i < texto.length()) {
            System.out.println(texto.charAt(i));
            hilera.CrearHilera(texto.charAt(i));
            i++;
        }
    }

}