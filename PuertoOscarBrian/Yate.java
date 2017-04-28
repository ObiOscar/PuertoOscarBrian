 


/**
 * Es la clase Yate, sera una hija clase de la clase barco
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
public class Yate extends EmbarcacionAMotor
{

    private int numCamarote;
    
    /**
     * Constructor de la calse Yate
     * los otros parametros son de la clase padre
     * @param numCamarote sera el numero de camarote que tiene el yate
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int numCamarote)
    {
        super(matricula,eslora,ano,propietario,potencia);
        this.numCamarote=numCamarote;
    }

    /**
     * Devuelve el toString de la clase Yate
     * @return cadenaADevolver nos devuelve el toString de la clase padre (embarcacionAMotor) 
     * esta a su vez nos da el toString de la clase barco y nos devuelve los numero de camarote de esta clase
    */
    public String toString()
    {
        String cadenaADevolver = super.toString();;
        cadenaADevolver += "Numero Camarotes" + numCamarote + "\n";
        return cadenaADevolver;
    }
    
    /**
     * sobrescribe el metodo abstracto de la clase barco
     * @return super.getCoeficienteBernue() + numCamarote  nod devuelve el resultado del metodo getCoeficienteBernue de la clase embarcacionAMotor
     * y sumando el numero de camarote
     */
       public int getCoeficienteBernue(){       
        return super.getCoeficienteBernue() + numCamarote;
    }
}
