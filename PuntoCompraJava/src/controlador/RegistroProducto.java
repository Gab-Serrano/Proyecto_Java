/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author nearQ
 */
public class RegistroProducto {
    
    public boolean agregarProducto(Producto producto){
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSERT INTO producto(codProducto,descripcionProducto,precioUnitario,stock,codCategoria,numRazonSocialProv,porcentajeDescuento) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, producto.getCodProducto());
            stmt.setString(2, producto.getDescripcionProducto());
            stmt.setInt(3, producto.getPrecioUnitario());
            stmt.setInt(4, producto.getStock());
            stmt.setInt(5, producto.getCodigoCategoria());
            stmt.setInt(6, producto.getNumRazonSocialProv());
            stmt.setDouble(7, producto.getPorcentajeDescuento());
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Error en la consulta SQL agregar producto, "+ e.getMessage());
            return false;
        }
    
    }  
    public boolean eliminarProducto(String nombre){      
        
        boolean flag = false;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "DELETE FROM producto WHERE descripcionProducto = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre);
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?","Eliminar producto",1);
            if (resp == 0) {           
                stmt.executeUpdate();
                stmt.close();
                cnx.close();
                flag = true;
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error en la consulta SQL eliminar producto, "+ e.getMessage());
            flag = false;
        }
        return flag;
    
    }
      
    public boolean actualizarProducto(String nombre,String nombreNew){      
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "UPDATE producto SET descripcionProducto = ? WHERE descripcionProducto = ? ";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombreNew);
            stmt.setString(2, nombre);             
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL en actualizar, "+ e.getMessage());
            return false;
        }
    
    }
    
    
    public Producto buscarPorNombre(String nombre){
        
        Producto pro = new Producto();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM producto WHERE descripcionProducto = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                pro.setCodProducto(rs.getInt("codProducto"));
                pro.setDescripcionProducto(rs.getString("descripcionProducto"));
                
            }
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL consultar por nombre, "+ e.getMessage());
        }
        
        return pro;
    
    }
    
    
    public List<Producto> buscarTodos(){
        
        List<Producto> listaProd = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM producto";
            PreparedStatement stmt = cnx.prepareCall(query);        
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setCodProducto(rs.getInt("codProducto"));
                pro.setDescripcionProducto(rs.getString("descripcionProducto"));
                pro.setPrecioUnitario(rs.getInt("precioUnitario"));
                pro.setStock(rs.getInt("stock")); 
                pro.setCodigoCategoria(rs.getInt("codCategoria")); 
                pro.setNumRazonSocialProv(rs.getInt("numRazonSocialProv"));
                pro.setPorcentajeDescuento(rs.getInt("porcentajeDescuento")); 
                listaProd.add(pro);
                
            }
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL consultar todos los datos, "+ e.getMessage());
        }
        
        return listaProd;
    
    }
    
    
 
    
}
