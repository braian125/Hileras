package hileras;

/**
 *
 * @author Brian Vanegas
 */
public class ListaHileraDoble {
    private NodoDoble cab, ult, x;

    public ListaHileraDoble()
    {
        cab = new NodoDoble(' ');
        ult = x = cab;
    }

    public void CrearHilera(char pCar)
    {
        NodoDoble p = new NodoDoble(pCar);
        ult.AsignaLigaDer(p);
        p.AsignaLigaIzq(ult);
        ult = p;
    }

    public void Insertar(char pCar)
    {

    }

    public char MostrarDatos()
    {
        x = x.RetornaLigaDer();
        if(x == null)
        {
            x = cab;
        }
        return x.GetCaracter();
    }
}