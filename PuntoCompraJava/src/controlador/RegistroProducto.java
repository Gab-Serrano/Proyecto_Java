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
            
            String query = "INSERT INTO producto(codProducto,descripcionProducto,precioUnitario,stock,cantidadSellos,codCategoria,numRazonSocialProv,porcentajeDescuento) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, producto.getCodProducto());
            stmt.setString(2, producto.getDescripcionProducto());
            stmt.setInt(3, producto.getPrecioUnitario());
            stmt.setInt(4, producto.getStock());
            stmt.setInt(5, producto.getCantidadSellos());
            stmt.setInt(6, producto.getCodigoCategoria());
            stmt.setInt(7, producto.getNumRazonSocialProv());
            stmt.setDouble(8, producto.getPorcentajeDescuento());
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Error en la consulta SQL agregar, "+ e.getMessage());
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
            
            System.out.println("Error en la consulta SQL eliminar, "+ e.getMessage());
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
        
        List<Producto> lista = new ArrayList<>();
        
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
                pro.setCantidadSellos(rs.getInt("cantidadSellos"));  
                lista.add(pro);
                
            }
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL consultar todos los datos, "+ e.getMessage());
        }
        
        return lista;
    
    }
    
    
    
    public Empleado log(String usuarioEmpleado, String contrasenaEmpleado){
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        Empleado e = new Empleado(); 
        Conexion cn = new Conexion(); 
        
        String sql = "SELECT * FROM pNombreEmpleado WHERE usuarioEmpleado = ? AND contrasenaEmpleado = ?";
        try {
            con = cn.obtenerConexion();
            ps= con.prepareStatement(sql);
            ps.setString(1, usuarioEmpleado);
            ps.setString(2, contrasenaEmpleado);
            rs = ps.executeQuery();
            if (rs.next()) {
                e.setNumRutEmpleado(rs.getInt("id"));
                e.setpNombreEmpleado(rs.getString("nombre"));
                e.setUsuarioEmpleado(rs.getString("usuario"));
                e.setContrasenaEmpleado(rs.getString("pass"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return e;
    }
    
}
