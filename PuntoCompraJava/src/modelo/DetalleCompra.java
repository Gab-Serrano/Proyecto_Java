/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class DetalleCompra {
    private int idCompra, codProducto, cantidad;

    public DetalleCompra() {
    }

    public DetalleCompra(int idCompra, int codProducto, int cantidad) {
        this.idCompra = idCompra;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleCompra{" + "idCompra=" + idCompra + ", codProducto=" + codProducto + ", cantidad=" + cantidad + '}';
    }
    
    
}
