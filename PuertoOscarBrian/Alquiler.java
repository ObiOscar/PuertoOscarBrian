package PuertoOscarBrian.PuertoOscarBrian;


/**
 * Clase alquiler de amarres del puerto.
 * 
 * @author (Brian) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    /**
     * Constructor de obejtos de la clase alquiler.
     */
    public Alquiler(int numDias,int posicionAmarre,Barco barco)
    {
        diasOcupacion = numDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    /**
     * Metodo que devuelve una cadena de caracteres con toda la informacion referente al alquiler.
     * @return Devuelve un string con la informacion del alquiler.
     */
    public String toString()
    {
        String textoDevolver = "";
        textoDevolver = textoDevolver + diasOcupacion + " dias de alquiler, amarre numero " + posicionAmarre + barco.toString();
        return textoDevolver;
    }
    /**
     * Metodo que devuelve el precio de un determinado alquiler.
     * @return Devuelve el precio de alquiler.
     */
     public float getPrecioAlquiler()
    {
        float precioAlquiler = diasOcupacion * (10 * (float)barco.getEslora()) + VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernue();
        return precioAlquiler;
    }
}
