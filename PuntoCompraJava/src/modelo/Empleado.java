/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author david
 */
public class Empleado {
    private int numRutEmpleado, celularEmpleado,codRegion,codProvincia,codComuna,numRazonSocialEmpresa;
    private String dvRutEmpleado, pNombreEmpleado, pApellidoEmpleado, sApellidoEmpleado, emailEmpleado, direccionEmpleado, usuarioEmpleado, contrasenaEmpleado;
    private Date fechaNacEmpleado;

    public Empleado() {
    }

    public Empleado(int numRutEmpleado, int celularEmpleado, int codRegion, int codProvincia, int codComuna, int numRazonSocialEmpresa, String dvRutEmpleado, String pNombreEmpleado, String pApellidoEmpleado, String sApellidoEmpleado, String emailEmpleado, String direccionEmpleado, String usuarioEmpleado, String contrasenaEmpleado, Date fechaNacEmpleado) {
        this.numRutEmpleado = numRutEmpleado;
        this.celularEmpleado = celularEmpleado;
        this.codRegion = codRegion;
        this.codProvincia = codProvincia;
        this.codComuna = codComuna;
        this.numRazonSocialEmpresa = numRazonSocialEmpresa;
        this.dvRutEmpleado = dvRutEmpleado;
        this.pNombreEmpleado = pNombreEmpleado;
        this.pApellidoEmpleado = pApellidoEmpleado;
        this.sApellidoEmpleado = sApellidoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.direccionEmpleado = direccionEmpleado;
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

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
    }

    public int getNumRazonSocialEmpresa() {
        return numRazonSocialEmpresa;
    }

    public void setNumRazonSocialEmpresa(int numRazonSocialEmpresa) {
        this.numRazonSocialEmpresa = numRazonSocialEmpresa;
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

    public Date getFechaNacEmpleado() {
        return fechaNacEmpleado;
    }

    public void setFechaNacEmpleado(Date fechaNacEmpleado) {
        this.fechaNacEmpleado = fechaNacEmpleado;
    }

    
    
    
}
