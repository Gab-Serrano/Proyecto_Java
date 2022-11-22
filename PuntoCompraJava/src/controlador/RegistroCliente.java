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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Proveedor;
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
    
    
    
     public List listarCliente(){
         
        Conexion cn = new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        List<Usuario> lista = new ArrayList();
        
        String sql = "SELECT *FROM usuario";
        
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            
          
            while (rs.next()) {
                Usuario us = new Usuario();
                us.setCodUsuario(rs.getInt("codigo"));
                us.setNumRutUsuario(rs.getInt("rut"));
                us.setpNombreUsuario(rs.getString("nombre"));
                us.setEmailUsuario(rs.getString("email")); 
                
                lista.add(us);
                
            }
            
            

        } catch (SQLException e) {          
            System.out.println(e.toString());
        }
        
        return lista;
    
    }
    
    
    
    
}
