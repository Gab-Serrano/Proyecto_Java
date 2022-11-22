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
import modelo.Compra;

/**
 *
 * @author nearQ
 */
public class RegistroCompra {
    
    public List<Compra> listaDeCompra(){
        
        List<Compra> listaCompra = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM compra";
            PreparedStatement stmt = cnx.prepareCall(query);        
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Compra com = new Compra();
                com.setIdCompra(rs.getInt("idCompra"));
                com.setFechaCompra(rs.getDate("fechaCompra"));
                com.setTotal(rs.getInt("total"));
                com.setDescuentoTotal(rs.getInt("descuentoTotal"));
                com.setTotalFinal(rs.getInt("totalFinal"));
                com.setCodUsuario(rs.getInt("codUsuario"));
                com.setCodMedioPago(rs.getInt("codMedioPago"));
                com.setNumRutEmpleado(rs.getInt("numRutEmpleado"));
                com.setNumRazonSocialEmpresa(rs.getInt("numRazonSocialEmpresa"));
                com.getDetalleCompra().setCodProducto(rs.getInt("codProducto"));
                com.getDetalleCompra().setCantidad(rs.getInt("cantidad"));             
                listaCompra.add(com);
                
            }
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {          
            System.out.println("Error en la consulta SQL consultar todos los datos de la compra, "+ e.getMessage());
        }
        
        return listaCompra;
    
    }
    
    public boolean eliminarCompra(int codigo){      
        
        boolean flag = false;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "DELETE FROM compra WHERE codProducto = ?";
            PreparedStatement stmt = cnx.prepareCall(query);
            stmt.setInt(1, codigo);
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar?","Eliminar compra",1);
            if (resp == 0) {           
                stmt.executeUpdate();
                stmt.close();
                cnx.close();
                flag = true;
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error en la consulta SQL eliminar compra, "+ e.getMessage());
            flag = false;
        }
        return flag;
    
    }
    
}
