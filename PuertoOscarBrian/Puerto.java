 

/**
 * Clase puerto, con la que se va a interactuar. 
 * 
 * @author (Brian) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] amarres;

    /**
     * Constructor de obejetos de la clase puerto.
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    /**
     * Metodo para alquilarle a un cliente un amarre.
     * @param numDias Indica el numero de dias que va a permanecer el amarre alquilado.
     * @param barco indica el barco que va a guardarse en el amarre.
     * @return Devuelve -1 si todos los amarres ya estan alquilados. Devuelve el precio de alquiler
     * si encuentra algun amarre vacio.
     */
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
    /**
     * Metodo para liquidar un amarre y y dejarlo libre.
     * @param posicionAmarre Indica la posicion(0,1,2 o 3) del amarre que queremos liquidar.
     * @return Devuelve -1 si el amarre esta libre o no existe. Devuelve el precio del amarre si 
     * se introduce un amarre valido.
     */
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
    /**
     * Metodo que nos muestra el estado de los amarres.De los amarres alquilados ademas 
     * nos facilitara toda la informacion del barco que lo ocupa.
     * @return Devuelve false en el caso de que todos los amarres esten ocupados.Si encuentra alguno
     * libre devuelve true.
     */
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
                System.out.println("El amarre " + contador + " no esta libre." + amarres[contador].toString());
            }
            contador ++;
        }
        return libre;
    }
    /**
     * Nos dice si quedan amarres libres en nuestro puerto.
     * @return Devuelve true o false dependiendo de si hay amarres libres.
     */
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