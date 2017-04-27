package PuertoOscarBrian.PuertoOscarBrian;


/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula,eslora,ano,propietario);
        this.potencia=potencia;
    }

    /**
     * Devuelve el toString de la clase EmbarcacionAMotor
    */
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Potencia Motor" + potencia + "\n";
        return cadenaADevolver;
    }
    
     public int getCoeficienteBernue(){       
        return potencia;
    }
}
