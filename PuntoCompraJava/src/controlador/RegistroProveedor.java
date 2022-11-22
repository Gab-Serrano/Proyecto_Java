/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Proveedor;

/**
 *
 * @author nearQ
 */
public class RegistroProveedor {
    
    public boolean agregarProveedor(Proveedor proveedor){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSERT INTO proveedor(numRazonSocialProv,dvRazonSocialProv,nombreProv,emailProv,direccionProv,codRegion,codProvincia,codComuna,telefonoProv) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, proveedor.getNumRazonSocialProv());
            stmt.setString(2, proveedor.getDvRazonSocialprov());
            stmt.setString(3, proveedor.getNombreProv());
            stmt.setString(4, proveedor.getEmailProv());
            stmt.setString(5, proveedor.getDireccionProv());
            stmt.setInt(6, proveedor.getCodRegion());
            stmt.setInt(7, proveedor.getCodProvincia());
            stmt.setInt(8, proveedor.getCodComuna());
            stmt.setInt(9, proveedor.getTeleFonoProv());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Error en la consulta SQL agregar proveedor, "+ e.getMessage());
            return false;
        }
    
    }
    
    public boolean eliminarProveedor(String nombre){      
        
        boolean flag = false;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "DELETE FROM proveedor WHERE nombreProv = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre);
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?","Eliminar proveedor",1);
            if (resp == 0) {           
                stmt.executeUpdate();
                stmt.close();
                cnx.close();
                flag = true;
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error en la consulta SQL eliminar proveedor, "+ e.getMessage());
            flag = false;
        }
        return flag;
    
    }
 
    public Proveedor buscarPorNombreProveedor(String nombre){
        
        Proveedor prov = new Proveedor();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM producto WHERE descripcionProducto = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                prov.setNumRazonSocialProv(rs.getInt("numRazonSocialProv"));
                prov.setNombreProv(rs.getString("nombreProv"));
                
            }
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL consultar por nombre proveedor, "+ e.getMessage());
        }
        
        return prov;
    
    }

    public List<Proveedor> buscarTodosProveedores(){
        
        List<Proveedor> listaProv = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM proveedor";
            PreparedStatement stmt = cnx.prepareCall(query);        
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Proveedor prov = new Proveedor();
                prov.setNumRazonSocialProv(rs.getInt("numRazonSocialProv"));
                prov.setDvRazonSocialprov(rs.getString("dvRazonSocialProv"));
                prov.setNombreProv(rs.getString("nombreProv")); 
                prov.setEmailProv(rs.getString("emailProv")); 
                prov.setDireccionProv(rs.getString("direccionProv"));
                prov.setCodRegion(rs.getInt("codRegion"));
                prov.setCodProvincia(rs.getInt("codProvincia"));
                prov.setCodComuna(rs.getInt("codComuna"));
                prov.setTeleFonoProv(rs.getInt("telefonoProv"));
                listaProv.add(prov);
                
            }
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL consultar todos los datos del proveedor, "+ e.getMessage());
        }
        
        return listaProv;
    
    }
    
    
}
