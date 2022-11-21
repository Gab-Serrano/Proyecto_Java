/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class Empresa {
    
    private int numRazonSocial, dvRazonSocial, telefonoEmpresa;
    private String nombreEmpresa, emailEmpresa, direccionEmpresa, regionEmpresa, provinciaEmpresa;

    public Empresa() {
    }

    public Empresa(int numRazonSocial, int dvRazonSocial, int telefonoEmpresa, String nombreEmpresa, String emailEmpresa, String direccionEmpresa, String regionEmpresa, String provinciaEmpresa) {
        this.numRazonSocial = numRazonSocial;
        this.dvRazonSocial = dvRazonSocial;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.regionEmpresa = regionEmpresa;
        this.provinciaEmpresa = provinciaEmpresa;
    }

    public int getNumRazonSocial() {
        return numRazonSocial;
    }

    public void setNumRazonSocial(int numRazonSocial) {
        this.numRazonSocial = numRazonSocial;
    }

    public int getDvRazonSocial() {
        return dvRazonSocial;
    }

    public void setDvRazonSocial(int dvRazonSocial) {
        this.dvRazonSocial = dvRazonSocial;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getRegionEmpresa() {
        return regionEmpresa;
    }

    public void setRegionEmpresa(String regionEmpresa) {
        this.regionEmpresa = regionEmpresa;
    }

    public String getProvinciaEmpresa() {
        return provinciaEmpresa;
    }

    public void setProvinciaEmpresa(String provinciaEmpresa) {
        this.provinciaEmpresa = provinciaEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" + "numRazonSocial=" + numRazonSocial + ", dvRazonSocial=" + dvRazonSocial + ", telefonoEmpresa=" + telefonoEmpresa + ", nombreEmpresa=" + nombreEmpresa + ", emailEmpresa=" + emailEmpresa + ", direccionEmpresa=" + direccionEmpresa + ", regionEmpresa=" + regionEmpresa + ", provinciaEmpresa=" + provinciaEmpresa + '}';
    }
    
}
