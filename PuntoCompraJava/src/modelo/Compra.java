/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*hola git*/
/*Chao git*/
/*Nos vemos git*/
package modelo;

import java.time.LocalDate;

/**
 *
 * @author david
 */
public class Compra {
    private int idCompra, total, descuento, totalFinal, codUsuario,codMedioPago,numRutEmpleado;
    private LocalDate fechaCompra;

    public Compra() {
    }

    public Compra(int idCompra, int total, int descuento, int totalFinal, int codUsuario, int codMedioPago, int numRutEmpleado, LocalDate fechaCompra) {
        this.idCompra = idCompra;
        this.total = total;
        this.descuento = descuento;
        this.totalFinal = totalFinal;
        this.codUsuario = codUsuario;
        this.codMedioPago = codMedioPago;
        this.numRutEmpleado = numRutEmpleado;
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTotalFinal() {
        return totalFinal;
    }
//COdigo
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

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", total=" + total + ", descuento=" + descuento + ", totalFinal=" + totalFinal + ", codUsuario=" + codUsuario + ", codMedioPago=" + codMedioPago + ", numRutEmpleado=" + numRutEmpleado + ", fechaCompra=" + fechaCompra + '}';
    }
    
}
