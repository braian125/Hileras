/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hileras;

/**
 *
 * @author Brian Vanegas
 */
public class NodoDoble
{
    private char caracter;
    private NodoDoble ligaIzq, ligaDer;

    public NodoDoble(char pCaracter)
    {
        caracter = pCaracter;
        ligaIzq = ligaDer = null;
    }

    public char GetCaracter()
    {
        return caracter;
    }

    public void SetCaracter(char pCaracter)
    {
        caracter = pCaracter;
    }

    public void AsignaLigaIzq(NodoDoble pLigaIzq)
    {
        ligaIzq = pLigaIzq;
    }

    public void AsignaLigaDer(NodoDoble pLigaDer)
    {
        ligaDer = pLigaDer;
    }

    public NodoDoble RetornaLigaIzq()
    {
        return ligaIzq;
    }

    public NodoDoble RetornaLigaDer()
    {
        return ligaDer;
    }
}
