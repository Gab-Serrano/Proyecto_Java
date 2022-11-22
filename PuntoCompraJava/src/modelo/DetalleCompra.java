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
    private int codProducto, cantidad;

    public DetalleCompra() {
    }

    public DetalleCompra(int codProducto, int cantidad) {
        this.codProducto = codProducto;
        this.cantidad = cantidad;
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
        return "DetalleCompra{" + "codProducto=" + codProducto + ", cantidad=" + cantidad + '}';
    }


    
    
}
