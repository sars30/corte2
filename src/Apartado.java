/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramir
 */

/*creamos la clase Apartado que es una subcalse de Medellin por eso se le añade la palabra reservada extends y luego el nombre de la supercalse
para este caso hay que recordar que los métodos y atributos la clase Medellin los heredó de la clase Bogota, entonces estamos heredando métodos
ya heredados lo que evidencia el patron de diseño factory abstrac*/
public class Apartado extends Medellin{
    
    //Se crea el construtor que le permite heredar los métodos y atributos que la clase medellin heredó de la clase bogota
    public Apartado(String tipo, String peso, String descripcion, String destino, String envia, String origen) {
        super(tipo, peso, descripcion, destino, envia, origen);
    }
    
}
