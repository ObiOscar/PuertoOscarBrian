package PuertoOscarBrian.PuertoOscarBrian;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase Test
 * 
 */
public class Test0134
{
    public Test0134()
    {        
    }

    public void test1()
    {
        Persona enrique = new Persona("Enrique Iglesias", "71456456H");
        Persona juan = new Persona("Juan Magan", "76233233K");
        Persona romeo = new Persona("Romeo Santos", "72544544L");
        Persona jennifer = new Persona("Jennifer Lopez", "9865865T");
        Persona marc = new Persona("Marc Anthony", "9666777C");

        Barco veleroEnrique = new Velero("DFT444", 23.5, 1996, enrique, 4);        
        Barco embarcacionAMotorJuan = new EmbarcacionAMotor("HJJ987", 45.2, 2002, juan, 1200);
        Barco yateRomeo = new Yate("KIO123", 70.0, 2010, romeo, 1500, 15);

        Barco veleroJennifer = new Velero("LLL890", 12.8, 1997, jennifer, 5);
        Barco yateMarc = new Yate("HOL332", 45.5, 2001, marc, 200, 21);
        
        Puerto puertoSantander = new Puerto();
        
        puertoSantander.verEstadoAmarres();
        
        //Primeros amarres
        assertEquals(3550, puertoSantander.alquilarAmarre(10, veleroEnrique));
        assertEquals(362260, puertoSantander.alquilarAmarre(5, embarcacionAMotorJuan));
        assertEquals(455900, puertoSantander.alquilarAmarre(2, yateRomeo));        
        puertoSantander.verEstadoAmarres();   

        //Se llena el puerto con el siguiente amarre
        assertEquals(2780, puertoSantander.alquilarAmarre(10, veleroJennifer));       
        puertoSantander.verEstadoAmarres();         
        
        //Se intenta alquilar un amarre pero no hay libres
        assertEquals(-1, puertoSantander.alquilarAmarre(3, yateMarc)); 
        puertoSantander.verEstadoAmarres();          
        
        //Se intenta terminar un alquiler de un amarre inexistente
        assertEquals(-1, puertoSantander.liquidarAlquilerAmarre(10));
        
        //Se terminan los alquileres
        assertEquals(2654, puertoSantander.liquidarAlquilerAmarre(0));
        assertEquals(3760, puertoSantander.liquidarAlquilerAmarre(1));  
        
        //Se intenta liquidar un alquiler que ya no existe
        assertEquals(-1, puertoSantander.liquidarAlquilerAmarre(0));
        
        //Marc alquila un amarre ahora que hay disponibles
        assertEquals(67665, puertoSantander.alquilarAmarre(3, yateMarc));   
        
        puertoSantander.verEstadoAmarres();            
    }

}