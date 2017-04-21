
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int numeroMastiles)
    {
        super(matricula,eslora,ano,propietario);
        this.numeroMastiles=numeroMastiles;
    }

    /**
     * Devuelve el toString de la clase Velero
    */
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Numero de Mastiles" + numeroMastiles;
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernue(){       
        return numeroMastiles;
    }
}
