 


/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 10;
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numDias,int posicionAmarre,Barco barco)
    {
        diasOcupacion = numDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    public String toString()
    {
        String textoDevolver = "";
        textoDevolver = textoDevolver + diasOcupacion + " dias de alquiler, amarre numero " + posicionAmarre + barco.toString();
        return textoDevolver;
    }
     public float getPrecioAlquiler()
    {
        float precioAlquiler = diasOcupacion * (10 * (float)barco.getEslora()) + VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernue();
        return precioAlquiler;
    }
}