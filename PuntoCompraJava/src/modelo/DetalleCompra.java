/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class DetalleCompra extends Compra{
    private int cantidad, totalProducto;
    private Producto producto;

    public DetalleCompra() {
    }

    public DetalleCompra(Producto producto, int cantidad, int totalProducto) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.totalProducto = totalProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public int getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(int totalProducto) {
        this.totalProducto = totalProducto;
    }


    
    
}
