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
    private int precioUnitario, stock,codigoCategoria,numRazonSocialProv;
    private double porcentajeDescuento;
    private String codProducto, descripcionProducto;

    public Producto() {
    }

    public Producto(String codProducto, int precioUnitario, int stock, int codigoCategoria, int numRazonSocialProv, double porcentajeDescuento, String descripcionProducto) {
        this.codProducto = codProducto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.codigoCategoria = codigoCategoria;
        this.numRazonSocialProv = numRazonSocialProv;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descripcionProducto = descripcionProducto;
    }
    //item.getDescripcionProducto(), item.getPrecioUnitario(), item.getPorcentajeDescuento(
    public Producto(String codProducto, String descripcionProducto, int precioUnitario, double porcentajeDescuento){
        this.codProducto = codProducto;
        this.precioUnitario = precioUnitario;
        this.porcentajeDescuento = porcentajeDescuento;
        this.descripcionProducto = descripcionProducto;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
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

    @Override
    public String toString() {
        return "Producto{" + "codProducto=" + codProducto + ", precioUnitario=" + precioUnitario + ", stock=" + stock + ", codigoCategoria=" + codigoCategoria + ", numRazonSocialProv=" + numRazonSocialProv + ", porcentajeDescuento=" + porcentajeDescuento + ", descripcionProducto=" + descripcionProducto + '}';
    }

    
    
    
    
    
    
}
