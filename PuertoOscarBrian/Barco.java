
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Barco
{
    // instance variables - replace the example below with your own
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
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
    */
    public String toString()
    {
        String cadenaADevolver = "Cliente" + propietario + "\n";
        cadenaADevolver += "Matricula" + matricula + "\n";
        cadenaADevolver += "Eslora" + eslora + "\n";
        cadenaADevolver += "Año de fabricación" + anoFabricacion + "\n";
        return cadenaADevolver;
    }
    
    public double getEslora(){
        return eslora;
    }
    
    abstract int getCoeficienteBernue();
}
