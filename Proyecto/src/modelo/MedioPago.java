/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class MedioPago {
    private int codMedioPago;
    private String nombreMedioPago;

    public MedioPago() {
    }

    public MedioPago(int codMedioPago, String nombreMedioPago) {
        this.codMedioPago = codMedioPago;
        this.nombreMedioPago = nombreMedioPago;
    }

    public int getCodMedioPago() {
        return codMedioPago;
    }

    public void setCodMedioPago(int codMedioPago) {
        this.codMedioPago = codMedioPago;
    }

    public String getNombreMedioPago() {
        return nombreMedioPago;
    }

    public void setNombreMedioPago(String nombreMedioPago) {
        this.nombreMedioPago = nombreMedioPago;
    }

    @Override
    public String toString() {
        return "MedioPago{" + "codMedioPago=" + codMedioPago + ", nombreMedioPago=" + nombreMedioPago + '}';
    }
    
}
