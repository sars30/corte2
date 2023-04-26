
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramir
 */
//creamos la clase (fabrica principal) que le denominamos Bogota
public class Bogota{
    
    conexion conectar = conexion.getInstance();
    //llamamos la instancia de la clase conexion para poder acceder a la base de datos
    private String tipo, peso, descripcion, destino, envia, origen;
    //definimos las variables necesarias para el envio de paquetes
    
    //creamos el constructor de la clase con los atributos necesarios
    public Bogota(String tipo, String peso, String descripcion, String destino, String envia, String origen) {
        this.tipo = tipo;
        this.peso = peso;
        this.descripcion = descripcion;
        this.destino = destino;
        this.envia = envia;
        this.origen = origen;
    }
    
    //definimos las variables que nesecitamos para el método que crearemos para enviar los paquetes
    String tran; 
    String empl; 
    String sum;
    //creamos el método que nos permitirá enviar los paquetes
    public void enviarPaquete(String tran, String empl, String sum){ 
        //mediuante un capturador de errores haremos el envio, si algo sale mal este nos mostrará el error
        try{
            Connection conexion = conectar.conectar();
            //accedemos a la calse conexión a trevez de su instancia
            PreparedStatement stm = conexion.prepareStatement("insert into envios (empaque,peso,descripcion,destino,envia,transporte,empleados,suministros) values(?,?,?,?,?,?,?,?)");
            //definimos el insert para guardar los datos del envio en la base de datos
            /*
                Asignamos los valores que vamos a guardar al campo correspondiente en la base de datos
                1.El tipo de paquete a enviar
                2.el peso del mismo
                3.su descripción
                4.hacia donde va
                5.remitente
                6.en que se envia
                7.cantidad de empleados usados
                8.suministros a los empleados
            */
            stm.setString(1, tipo);//1
            stm.setString(2, peso);//2
            stm.setString(3, descripcion);//3
            stm.setString(4, destino);//4
            stm.setString(5, envia);//5
            stm.setString(6, tran);//6
            stm.setString(7, empl);//7
            stm.setString(8, sum);//8
            stm.executeUpdate();
            //ejecutamos el insert
            JOptionPane.showMessageDialog(null, "Envio Exitoso desde: "+origen+", Hasta: "+destino+", en: "+tran+", enviado por: "+envia);
            //si se guarda correctamente se mostrará un mensaje de confirmación
            conectar.desconectar();
            //a trevez de la instancia nos desconectamos de la base de datos
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de Envio "+ e.getMessage());
            //En caso de algún error se mostrará un mensaje de advertencia
        }
    }
    
}
