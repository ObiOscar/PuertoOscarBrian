

/**
 * Es la clase barco, sera una clase abstracta, y sobre ella se basara el resto de barcos
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
abstract class Barco
{
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    /**
     * Constructor de la calse Barco
     * @param matricula Es la matricula del barco
     * @param eslora son los metros de eslora del barco
     * @param ano año del barco
     * @param propietario es el propietario del barco
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
        this.propietario = propietario;
    }

    /**
     * Devuelve el toString de la clase Persona
     * @return cadenaADevolver nos muestra los atributos de la clase Persona
    */
    public String toString()
    {
        String cadenaADevolver = "Cliente" + propietario + "\n";
        cadenaADevolver += "Matricula" + matricula + "\n";
        cadenaADevolver += "Eslora" + eslora + "\n";
        cadenaADevolver += "Año de fabricación" + anoFabricacion + "\n";
        return cadenaADevolver;
    }
    
    /**
     * Nos devuelve los metros de eslora
     * @return eslora nos devuelve el atributo eslora
     */
    public double getEslora(){
        return eslora;
    }
    
    /**
     * es una clase abstracta que sera sobrescrita por las clases hijas.
     */
    abstract int getCoeficienteBernue();
}
