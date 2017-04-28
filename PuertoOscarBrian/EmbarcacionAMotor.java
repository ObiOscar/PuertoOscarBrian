
/**
 * Es la clase embarcacionAMotor, sera una hija clase de la clase barco
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
public class EmbarcacionAMotor extends Barco
{
    /**
     * la potencia que tiene el motor del barco, siempre en CV
     */
    private int potencia;

    /**
     * Constructor de la calse EmbarcacionAMotor
     * @param matricula Es la matricula del barco
     * @param eslora son los metros de eslora del barco
     * @param ano año del barco
     * @param propietario es el propietario del barco
     * @param potencia es la potencia del barco medido en CV
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula,eslora,ano,propietario);
        this.potencia=potencia;
    }

    /**
     * Devuelve el toString de la clase EmbarcacionAMotor
     * @return cadenaADevolver nos devuelve el toString de la clase padre (Barco) y el parametro de la clase EmbarcacionAMotor (potencia)
    */
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Potencia Motor" + potencia + "\n";
        return cadenaADevolver;
    }
    
    /**
     * sobrescribe el metodo abstracto de la clase barco
     * @return potencia devueve la potencia
     */
     public int getCoeficienteBernue(){       
        return potencia;
    }
}
