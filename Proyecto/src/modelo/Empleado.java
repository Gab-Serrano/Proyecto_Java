/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author david
 */
public class Empleado {
    private int numRutEmpleado, celularEmpleado;  
    private String dvRutEmpleado, pNombreEmpleado, pApellidoEmpleado, sApellidoEmpleado, emailEmpleado, direccionEmpleado, regionEmpleado, provinciaEmpleado, comunaEmpleado, usuarioEmpleado, contrasenaEmpleado;
    private LocalDate fechaNacEmpleado;

    public Empleado() {
    }

    public Empleado(int numRutEmpleado, int celularEmpleado, String dvRutEmpleado, String pNombreEmpleado, String pApellidoEmpleado, String sApellidoEmpleado, String emailEmpleado, String direccionEmpleado, String regionEmpleado, String provinciaEmpleado, String comunaEmpleado, String usuarioEmpleado, String contrasenaEmpleado, LocalDate fechaNacEmpleado) {
        this.numRutEmpleado = numRutEmpleado;
        this.celularEmpleado = celularEmpleado;
        this.dvRutEmpleado = dvRutEmpleado;
        this.pNombreEmpleado = pNombreEmpleado;
        this.pApellidoEmpleado = pApellidoEmpleado;
        this.sApellidoEmpleado = sApellidoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.regionEmpleado = regionEmpleado;
        this.provinciaEmpleado = provinciaEmpleado;
        this.comunaEmpleado = comunaEmpleado;
        this.usuarioEmpleado = usuarioEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.fechaNacEmpleado = fechaNacEmpleado;
    }

    public int getNumRutEmpleado() {
        return numRutEmpleado;
    }

    public void setNumRutEmpleado(int numRutEmpleado) {
        this.numRutEmpleado = numRutEmpleado;
    }

    public int getCelularEmpleado() {
        return celularEmpleado;
    }

    public void setCelularEmpleado(int celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }

    public String getDvRutEmpleado() {
        return dvRutEmpleado;
    }

    public void setDvRutEmpleado(String dvRutEmpleado) {
        this.dvRutEmpleado = dvRutEmpleado;
    }

    public String getpNombreEmpleado() {
        return pNombreEmpleado;
    }

    public void setpNombreEmpleado(String pNombreEmpleado) {
        this.pNombreEmpleado = pNombreEmpleado;
    }

    public String getpApellidoEmpleado() {
        return pApellidoEmpleado;
    }

    public void setpApellidoEmpleado(String pApellidoEmpleado) {
        this.pApellidoEmpleado = pApellidoEmpleado;
    }

    public String getsApellidoEmpleado() {
        return sApellidoEmpleado;
    }

    public void setsApellidoEmpleado(String sApellidoEmpleado) {
        this.sApellidoEmpleado = sApellidoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getRegionEmpleado() {
        return regionEmpleado;
    }

    public void setRegionEmpleado(String regionEmpleado) {
        this.regionEmpleado = regionEmpleado;
    }

    public String getProvinciaEmpleado() {
        return provinciaEmpleado;
    }

    public void setProvinciaEmpleado(String provinciaEmpleado) {
        this.provinciaEmpleado = provinciaEmpleado;
    }

    public String getComunaEmpleado() {
        return comunaEmpleado;
    }

    public void setComunaEmpleado(String comunaEmpleado) {
        this.comunaEmpleado = comunaEmpleado;
    }

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public LocalDate getFechaNacEmpleado() {
        return fechaNacEmpleado;
    }

    public void setFechaNacEmpleado(LocalDate fechaNacEmpleado) {
        this.fechaNacEmpleado = fechaNacEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numRutEmpleado=" + numRutEmpleado + ", celularEmpleado=" + celularEmpleado + ", dvRutEmpleado=" + dvRutEmpleado + ", pNombreEmpleado=" + pNombreEmpleado + ", pApellidoEmpleado=" + pApellidoEmpleado + ", sApellidoEmpleado=" + sApellidoEmpleado + ", emailEmpleado=" + emailEmpleado + ", direccionEmpleado=" + direccionEmpleado + ", regionEmpleado=" + regionEmpleado + ", provinciaEmpleado=" + provinciaEmpleado + ", comunaEmpleado=" + comunaEmpleado + ", usuarioEmpleado=" + usuarioEmpleado + ", contrasenaEmpleado=" + contrasenaEmpleado + ", fechaNacEmpleado=" + fechaNacEmpleado + '}';
    }
    
    
}
