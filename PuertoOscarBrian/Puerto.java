 


/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    public float alquilarAmarre(int numDias,Barco barco)
    {
        float resultado = -1;
        int contador = 0;
        while(contador < amarres.length && resultado == -1)
        {
            if(amarres[contador] == null)
            {
                amarres[contador] = new Alquiler(numDias,contador,barco);
                resultado = (float)((numDias*(barco.getEslora()*10)) + (300 * barco.getCoeficienteBernue()));
            }
            contador++;
        }
        return resultado;
    }
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float resultado = 0;
        if(posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null)
        {
            resultado = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre]= null;
        }
        else
        {
            resultado = -1;
            System.out.println("No existe ese amarre o esta libre.");
        }
        return resultado;
    }
    public boolean verEstadoAmarres()
    {
        int contador = 0;
        boolean libre = false;
        while(contador < 4)
        {
            if(amarres[contador] == null)
            {
                System.out.println("El amarre " + contador + " esta libre.");
                libre = true;
            }
            else
            {
                System.out.println("El amarre " + contador + " no esta libre.");
            }
            contador ++;
        }
        return libre;
    }
    private boolean hayAmarresLibres()
    {
        boolean respuesta = false;
        if(verEstadoAmarres() == true)
        {
            respuesta = true;
        }
        return respuesta;
    }
}
