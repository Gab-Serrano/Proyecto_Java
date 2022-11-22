/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author david
 */
public class Proveedor {
    private int numRazonSocialProv, teleFonoProv,codRegion,codProvincia,codComuna;
    private String nombreProv, emailProv, direccionProv,dvRazonSocialprov;

    public Proveedor() {
    }

    public Proveedor(int numRazonSocialProv, int teleFonoProv, int codRegion, int codProvincia, int codComuna, String nombreProv, String emailProv, String direccionProv, String dvRazonSocialprov) {
        this.numRazonSocialProv = numRazonSocialProv;
        this.teleFonoProv = teleFonoProv;
        this.codRegion = codRegion;
        this.codProvincia = codProvincia;
        this.codComuna = codComuna;
        this.nombreProv = nombreProv;
        this.emailProv = emailProv;
        this.direccionProv = direccionProv;
        this.dvRazonSocialprov = dvRazonSocialprov;
    }

    public int getNumRazonSocialProv() {
        return numRazonSocialProv;
    }

    public void setNumRazonSocialProv(int numRazonSocialProv) {
        this.numRazonSocialProv = numRazonSocialProv;
    }

    public int getTeleFonoProv() {
        return teleFonoProv;
    }

    public void setTeleFonoProv(int teleFonoProv) {
        this.teleFonoProv = teleFonoProv;
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

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public String getDvRazonSocialprov() {
        return dvRazonSocialprov;
    }

    public void setDvRazonSocialprov(String dvRazonSocialprov) {
        this.dvRazonSocialprov = dvRazonSocialprov;
    }

    

    
    
    
}
