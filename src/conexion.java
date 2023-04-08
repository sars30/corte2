/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramir
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    
    private conexion(){
        
    }
    //variable para guardar el estado de la conexion
    private static Connection conectar;
    
    //variable para crear una unica instancia
    private static conexion instance;
    
    //variables para la conexion a la base de datos
    private static final String URL = "jdbc:mysql://localhost/corte2";
    private static final String username = "root";
    private static final String password = "";
    
    //método para la conexion a la base de datos
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(URL,username,password);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion" +e.getMessage());
        }
        return conectar;
    }
    
    //crear método para cerrar la conexión
    public void desconectar() throws SQLException{
        try{
            conectar.close();
        }catch (Exception e){
            JOptionPane.showInternalMessageDialog(null, "Error : " +e);
            conectar.close();
        }finally{
            conectar.close();
        }
    }
    
    //Crearmos la instancia para el patron Singleton
    public static conexion getInstance(){
        if(instance == null){
            instance = new conexion();
        }
        return instance;
    }
}