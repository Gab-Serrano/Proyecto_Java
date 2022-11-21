/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nearQ
 */
public class Conexion {
    
    public Connection obtenerConexion(){
        
        Connection conexion = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");          
            System.out.println("Conexion exitosa!");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar : "+ e.getMessage());
        }
        return conexion;
    }
    
}
