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
    
    private int numRazonSocialEmpresa, telefonoEmpresa,codRegion,codProvincia,codComuna;
    private String dvRazonSocialEmpresa, nombreEmpresa, emailEmpresa, direccionEmpresa;

    public Empresa() {
    }

    public Empresa(int numRazonSocialEmpresa, int telefonoEmpresa, int codRegion, int codProvincia, int codComuna, String dvRazonSocialEmpresa, String nombreEmpresa, String emailEmpresa, String direccionEmpresa) {
        this.numRazonSocialEmpresa = numRazonSocialEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.codRegion = codRegion;
        this.codProvincia = codProvincia;
        this.codComuna = codComuna;
        this.dvRazonSocialEmpresa = dvRazonSocialEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getNumRazonSocialEmpresa() {
        return numRazonSocialEmpresa;
    }

    public void setNumRazonSocialEmpresa(int numRazonSocialEmpresa) {
        this.numRazonSocialEmpresa = numRazonSocialEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
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

    public String getDvRazonSocialEmpresa() {
        return dvRazonSocialEmpresa;
    }

    public void setDvRazonSocialEmpresa(String dvRazonSocialEmpresa) {
        this.dvRazonSocialEmpresa = dvRazonSocialEmpresa;
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

    
    
}
