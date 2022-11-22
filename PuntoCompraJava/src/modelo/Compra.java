/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*hola git*/
/*Chao git*/
/*Nos vemos git*/
package modelo;

import java.util.Date;

/**
 *
 * @author david
 */
public class Compra {
    private int idCompra, total, descuentoTotal, totalFinal, codUsuario,codMedioPago,numRutEmpleado,numRazonSocialEmpresa;
    private DetalleCompra detalleCompra;
    private Date fechaCompra;

    public Compra() {
    }

    public Compra(int idCompra, int total, int descuentoTotal, int totalFinal, int codUsuario, int codMedioPago, int numRutEmpleado, int numRazonSocialEmpresa, DetalleCompra detalleCompra, Date fechaCompra) {
        this.idCompra = idCompra;
        this.total = total;
        this.descuentoTotal = descuentoTotal;
        this.totalFinal = totalFinal;
        this.codUsuario = codUsuario;
        this.codMedioPago = codMedioPago;
        this.numRutEmpleado = numRutEmpleado;
        this.numRazonSocialEmpresa = numRazonSocialEmpresa;
        this.detalleCompra = detalleCompra;
        this.fechaCompra = fechaCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(int descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public int getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(int totalFinal) {
        this.totalFinal = totalFinal;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodMedioPago() {
        return codMedioPago;
    }

    public void setCodMedioPago(int codMedioPago) {
        this.codMedioPago = codMedioPago;
    }

    public int getNumRutEmpleado() {
        return numRutEmpleado;
    }

    public void setNumRutEmpleado(int numRutEmpleado) {
        this.numRutEmpleado = numRutEmpleado;
    }

    public int getNumRazonSocialEmpresa() {
        return numRazonSocialEmpresa;
    }

    public void setNumRazonSocialEmpresa(int numRazonSocialEmpresa) {
        this.numRazonSocialEmpresa = numRazonSocialEmpresa;
    }

    public DetalleCompra getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(DetalleCompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    

    

    
}
