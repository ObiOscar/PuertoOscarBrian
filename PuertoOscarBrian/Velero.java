
/**
 * Es la clase Velero, sera una hija clase de la clase barco
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
public class Velero extends Barco
{

    private int numeroMastiles;
    
    /**
     * Constructor de la calse Velero
     * los otros parametros son de la clase padre
     * @param numCamarote sera el numero de camarote que tiene el yate
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int numeroMastiles)
    {
        super(matricula,eslora,ano,propietario);
        this.numeroMastiles=numeroMastiles;
    }

    /**
     * Devuelve el toString de la clase Velero
     * @return cadenaADevolver nos devuelve el toString de la clase padre (Barco) y tambien el numero de mastiles
    */
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Numero de Mastiles" + numeroMastiles + "\n";
        return cadenaADevolver;
    }
   
    /**
     * sobrescribe el metodo abstracto de la clase barco
     * @return numeroMastiles es el atributo numeroMastiles
     */
    public int getCoeficienteBernue(){       
        return numeroMastiles;
    }
}
