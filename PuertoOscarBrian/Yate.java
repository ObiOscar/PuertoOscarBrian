
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numCamarote;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int numCamarote)
    {
        super(matricula,eslora,ano,propietario,potencia);
        this.numCamarote=numCamarote;
    }

    /**
     * Devuelve el toString de la clase Yate
    */
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Numero Camarotes" + numCamarote + "\n";
        return cadenaADevolver;
    }
    
       public int getCoeficienteBernue(){       
        return super.getCoeficienteBernue() + numCamarote;
    }
}
