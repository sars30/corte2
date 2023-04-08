/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramir
 */

//creamos la clase barranquilla que es una subcalse de Bogota por eso se le añade la palabra reservada extends y luego el nombre de la supercalse
public class Barranquilla extends Bogota{
    
    //Se crea el construtor que le permite heredar los métodos y atributos de la superclase
    public Barranquilla(String tipo, String peso, String descripcion, String destino, String envia, String origen) {
        super(tipo, peso, descripcion, destino, envia, origen);
    }
    
}
