/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class Producto {
    private int codProducto, precioUnitario, stock, cantidadSellos,codigoCategoria,numRazonSocialProv;
    private double porcentajeDescuento;
    private String descripcionProducto;

    public Producto() {
    }

    public Producto(int codProducto, int precioUnitario, int stock, int cantidadSellos, int codigoCategoria, int numRazonSocialProv, double porcentajeDescuento, String descripcionProducto) {
        this.codProducto = codProducto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.cantidadSellos = cantidadSellos;
        this.codigoCategoria = codigoCategoria;
        this.numRazonSocialProv = numRazonSocialProv;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descripcionProducto = descripcionProducto;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadSellos() {
        return cantidadSellos;
    }

    public void setCantidadSellos(int cantidadSellos) {
        this.cantidadSellos = cantidadSellos;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public int getNumRazonSocialProv() {
        return numRazonSocialProv;
    }

    public void setNumRazonSocialProv(int numRazonSocialProv) {
        this.numRazonSocialProv = numRazonSocialProv;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    
    
    
    
    
}
