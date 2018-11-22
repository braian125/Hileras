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
        char aCar, opc;
        int i = 0;

        ListaHileraDoble hilera = new ListaHileraDoble();
        do{
            opc = Menu();
            switch (opc) {
                case '1':
                    texto = JOptionPane.showInputDialog(null, "Ingrese texto para crear la hilera", "initial value");
                    break;
                case '2':
                    /*while (i < texto.length()) {
                        System.out.println(texto.charAt(i));
                        hilera.CrearHilera(texto.charAt(i));
                        i++;
                    }*/
                    break;
            }
        } while(opc != '5');
    }

    static char Menu()
    {
        char opcion;
        do{
            opcion = JOptionPane.showInputDialog(null, "\n1. Crear o editar hilera\n2. Mostrar hilera\n3. Insertar\n4. Eliminar\n5. Salir").charAt(0);
        } while(opcion < '1' || opcion > '5');

        return opcion;
    }

}