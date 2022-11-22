/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Empleado;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Serrano
 */
public class RegistroLogIn {

    /**
     * Método para logearse. Recibe una String usuario y String contraseña.
     * Retorna un empleado para obtener su rol.
     *
     * @param usuario
     * @param contraseña
     * @return Empleado
     */
    public Empleado obtenerRolLog(String usuario, String contraseña) {
        //Instancia conexion
        Conexion cnx = new Conexion();
        Empleado empleado = new Empleado();

        //Genera sentencia
        String sentencia = "SELECT usuarioEmpleado, contraseñaEmpleado, codRol FROM empleado WHERE usuarioEmpleado = ? AND contraseñaEmpleado = ?";
        try {
            PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(sentencia);
            //Se cargan las variables paramétricas
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    empleado.setUsuarioEmpleado(rs.getString("usuarioEmpleado"));
                    empleado.setContrasenaEmpleado(rs.getString("contraseñaEmpleado"));
                    empleado.setCodRol(rs.getInt("codRol"));
                }

                JOptionPane.showMessageDialog(null, "Conexión exitosa", "Log-in", 2);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario.", "Log-in", 0);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroLogIn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + ex, "Buscar empleado", 1);
            //Mensaje de error en consola
            System.out.println("Error al iniciar sesión empleado: " + ex);

        }
        
        return empleado;
    }
        
    public Boolean validarLog(String usuario, String contraseña) {
        //Instancia conexion
        Conexion cnx = new Conexion();
        Empleado empleado = new Empleado();

        //Genera sentencia
        String sentencia = "SELECT usuarioEmpleado, contraseñaEmpleado, codRol FROM empleado WHERE usuarioEmpleado = ? AND contraseñaEmpleado = ?";
        try {
            PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(sentencia);
            //Se cargan las variables paramétricas
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();

            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    empleado.setUsuarioEmpleado(rs.getString("usuarioEmpleado"));
                    empleado.setContrasenaEmpleado(rs.getString("contraseñaEmpleado"));
                    empleado.setContrasenaEmpleado(rs.getString("codRol"));
                }

                JOptionPane.showMessageDialog(null, "Conexión exitosa", "Log-in", 0);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario.", "Log-in", 0);
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroLogIn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + ex, "Buscar empleado", 1);
            //Mensaje de error en consola
            System.out.println("Error al iniciar sesión empleado: " + ex);
            return false;
        }

    }

}
