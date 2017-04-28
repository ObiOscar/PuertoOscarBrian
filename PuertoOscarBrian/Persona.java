 


/**
 * Es la clase persona, será nuestro cliente
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
public class Persona
{
    /**
     * Es el nombre del cliente
     */
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     * @param nombre es el nombre del cliente
     * @param dni el documento nacional de identidad
     */
    public Persona(String nombre , String dni)
    {
       this.nombre = nombre;
       this.dni=dni;
    }

    /**
     * Devuelve el toString de la clase Persona
     * @return cadenaADevolver devuelve los atributos de la clase Persona, el nombre y el dni
     */
    public String toString()
    {
        String cadenaADevolver =nombre + " " + dni + "\n";
        return cadenaADevolver;
    }
}
