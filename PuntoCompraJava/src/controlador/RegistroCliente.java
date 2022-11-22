/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import  java.sql.Connection;
import javax.print.attribute.standard.PresentationDirection;
import modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author david
 */
public class RegistroCliente {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    public boolean registrarCliente(Usuario us){
        String sql = "INSERT INTO usuario(numRutUsuario,pNombreUsuario,emailUsuario)VALUES (?,?,?)";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, us.getNumRutUsuario());
            ps.setString(2, us.getpNombreUsuario());
            ps.setString(3, us.getEmailUsuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
