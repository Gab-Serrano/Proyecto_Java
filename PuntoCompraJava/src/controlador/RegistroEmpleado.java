/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import modelo.Empleado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Serrano
 * @version 1.0
 */
public class RegistroEmpleado {

    /**
     * M�todo que agrega un empleado a la BD. Recibe un par�metro de clase
     * Empleado. Retorna un boolean
     *
     * @param empleado
     * @return boolean
     */
    public boolean agregarEmpleado(Empleado empleado) {

        //Instancia conexion
        Conexion cnx = new Conexion();
        //Se declara sentencia
        String sentencia = "INSERT INTO empleado VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            //Se carga la plantilla de sentencia
            PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(sentencia);
            //Se cargan las variables param�tricas
            stmt.setInt(1, empleado.getNumRutEmpleado());
            stmt.setString(2, empleado.getDvRutEmpleado());
            stmt.setString(3, empleado.getpNombreEmpleado());
            stmt.setString(4, empleado.getpApellidoEmpleado());
            stmt.setString(5, empleado.getsApellidoEmpleado());
            stmt.setString(6, empleado.getEmailEmpleado());
            stmt.setInt(7, empleado.getCelularEmpleado());
            //Se parsea Date a SQL Date
            java.sql.Date dateSql = new java.sql.Date(empleado.getFechaNacEmpleado().getDay(), empleado.getFechaNacEmpleado().getMonth(), empleado.getFechaNacEmpleado().getYear());
            stmt.setDate(8, dateSql);
            stmt.setString(9, empleado.getDireccionEmpleado());
            stmt.setInt(10, empleado.getCodRegion());
            stmt.setInt(11, empleado.getCodProvincia());
            stmt.setInt(12, empleado.getCodComuna());
            stmt.setString(13, empleado.getUsuarioEmpleado());
            stmt.setString(14, empleado.getContrasenaEmpleado());
            stmt.setInt(15, 79547632);

            if (JOptionPane.showConfirmDialog(null, "�Est�s seguro que deseas agregar este usuario?", "Agregar usuario", 0) == 0) {
                //Se ejecuta la consulta
                stmt.executeUpdate();

                //Se cierran las conexiones
                stmt.close();
                cnx.obtenerConexion().close();

                //Mensaje de �xito
                JOptionPane.showMessageDialog(null, "Se ha agregado empleado con �xito.", "Agregar empleado", 1);

                //Retorna booleano exitoso
                return true;

            } else {
                //Se cierran las conexiones
                stmt.close();
                cnx.obtenerConexion().close();

                //Mensaje de �xito
                JOptionPane.showMessageDialog(null, "Se ha cancelado la operaci�n.", "Agregar empleado", 1);

                //Retorna booleano exitoso
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            //Mensaje de alerta de error
            JOptionPane.showMessageDialog(null, "Error al agregar empleado: " + ex, "Agregar empleado", 1);
            //Mensaje de error en consola
            System.out.println("Error al agregar empleado: " + ex);
            return false;

        }
    }

    public Empleado buscarEmpleado(String numRutEmpleado) {

        Empleado empleado = new Empleado();

        //Instancia conexion
        Conexion cnx = new Conexion();
        //Se declara sentencia
        String sentencia = "SELECT * FROM empleado WHERE numRutEmpleado = ?";

        try {
            //Se carga la plantilla de sentencia
            PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(sentencia);
            //Se cargan las variables param�tricas
            stmt.setString(1, numRutEmpleado);
            //Se ejecuta la consulta
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                empleado.setNumRutEmpleado(rs.getInt("numRutEmpleado"));
                empleado.setDvRutEmpleado(rs.getString("dvRutEmpleado"));
                empleado.setpNombreEmpleado(rs.getString("pNombreEmpleado"));
                empleado.setpApellidoEmpleado(rs.getString("pApellidoEmpleado"));
                empleado.setsApellidoEmpleado(rs.getString("sApellidoEmpleado"));
                empleado.setEmailEmpleado(rs.getString("emailEmpleado"));
                empleado.setCelularEmpleado(rs.getInt("celularEmpleado"));
                empleado.setFechaNacEmpleado(rs.getDate("fechaNacEmpleado"));
                empleado.setDireccionEmpleado(rs.getString("direccionEmpleado"));
                empleado.setCodComuna(rs.getInt("codComuna"));
                empleado.setCodProvincia(rs.getInt("codProvincia"));
                empleado.setCodRegion(rs.getInt("codRegion"));
                empleado.setDireccionEmpleado(rs.getString("direccionEmpleado"));
                empleado.setUsuarioEmpleado(rs.getString("usuarioEmpleado"));
                empleado.setContrasenaEmpleado(rs.getString("contrase�aEmpleado"));
                empleado.setNumRazonSocialEmpresa(rs.getInt("numRazonSocialEmpresa"));

            }

            //Se cierran las conexiones
            stmt.close();
            rs.close();
            cnx.obtenerConexion().close();

            return empleado;

        } catch (SQLException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            //Mensaje de alerta de error
            JOptionPane.showMessageDialog(null, "Error al buscar empleado: " + ex, "Buscar empleado", 1);
            //Mensaje de error en consola
            System.out.println("Error al buscar empleado: " + ex);
        }

        return empleado;
    }

    public boolean actualizarEmpleado(Empleado empleado) {
        //Instancia conexion
        Conexion cnx = new Conexion();
        //Se declara sentencia
        String sentencia = "UPDATE empleado SET numRutEmpleado = ?, dvRutEmpleado = ?, pNombreEmpleado = ?, pApellidoEmpleado = ?, sApellidoEmpleado = ?, "
                + "emailEmpleado = ?, celularEmpleado = ?, fechaNacEmpleado = ?, direccionEmpleado = ?, codRegion = ?, codProvincia = ?, codComuna = ?, "
                + "usuarioEmpleado = ?, contrase�aEmpleado = ? WHERE numRutEmpleado = ?";
        //Se carga la plantilla de sentencia
        PreparedStatement stmt;
        try {
            stmt = cnx.obtenerConexion().prepareStatement(sentencia);

            stmt.setInt(1, empleado.getNumRutEmpleado());
            stmt.setString(2, empleado.getDvRutEmpleado());
            stmt.setString(3, empleado.getpNombreEmpleado());
            stmt.setString(4, empleado.getpApellidoEmpleado());
            stmt.setString(5, empleado.getsApellidoEmpleado());
            stmt.setString(6, empleado.getEmailEmpleado());
            stmt.setInt(7, empleado.getCelularEmpleado());
            //Se parsea Date a SQL Date
            java.sql.Date dateSql = new java.sql.Date(empleado.getFechaNacEmpleado().getDay(), empleado.getFechaNacEmpleado().getMonth(), empleado.getFechaNacEmpleado().getYear());
            stmt.setDate(8, dateSql);
            stmt.setString(9, empleado.getDireccionEmpleado());
            stmt.setInt(10, empleado.getCodRegion());
            stmt.setInt(11, empleado.getCodProvincia());
            stmt.setInt(12, empleado.getCodComuna());
            stmt.setString(13, empleado.getUsuarioEmpleado());
            stmt.setString(14, empleado.getContrasenaEmpleado());
            stmt.setInt(15, empleado.getNumRutEmpleado());
            
            if (JOptionPane.showConfirmDialog(null, "�Est�s seguro que deseas modificar este usuario?", "Modificar usuario", 0) == 0) {
                //Se ejecuta la consulta
                stmt.executeUpdate();

                //Se cierran las conexiones
                stmt.close();
                cnx.obtenerConexion().close();

                //Mensaje de �xito
                JOptionPane.showMessageDialog(null, "Se ha modificado el empleado con �xito.", "Modificar empleado", 1);

                //Retorna booleano exitoso
                return true;

            } else {
                //Se cierran las conexiones
                stmt.close();
                cnx.obtenerConexion().close();

                //Mensaje de �xito
                JOptionPane.showMessageDialog(null, "Se ha cancelado la operaci�n.", "Agregar empleado", 1);

                //Retorna booleano exitoso
                return false;
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            //Mensaje de alerta de error
            JOptionPane.showMessageDialog(null, "Error al modificar empleado: " + ex, "Modificar empleado", 1);
            //Mensaje de error en consola
            System.out.println("Error al modificar empleado: " + ex);
            return false;
        }

    }

}
