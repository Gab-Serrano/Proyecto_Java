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
public class Proveedor {
    private int numRazonSocialProv, dvRazonSocialprov, teleFonoProv;
    private String nombreProv, emialProv, direccionProv, regionProv, provivenciaProv, comunaProv;
    private LocalDate FechaNacProv;

    public Proveedor() {
    }

    public Proveedor(int numRazonSocialProv, int dvRazonSocialprov, int teleFonoProv, String nombreProv, String emialProv, String direccionProv, String regionProv, String provivenciaProv, String comunaProv, LocalDate FechaNacProv) {
        this.numRazonSocialProv = numRazonSocialProv;
        this.dvRazonSocialprov = dvRazonSocialprov;
        this.teleFonoProv = teleFonoProv;
        this.nombreProv = nombreProv;
        this.emialProv = emialProv;
        this.direccionProv = direccionProv;
        this.regionProv = regionProv;
        this.provivenciaProv = provivenciaProv;
        this.comunaProv = comunaProv;
        this.FechaNacProv = FechaNacProv;
    }

    public int getNumRazonSocialProv() {
        return numRazonSocialProv;
    }

    public void setNumRazonSocialProv(int numRazonSocialProv) {
        this.numRazonSocialProv = numRazonSocialProv;
    }

    public int getDvRazonSocialprov() {
        return dvRazonSocialprov;
    }

    public void setDvRazonSocialprov(int dvRazonSocialprov) {
        this.dvRazonSocialprov = dvRazonSocialprov;
    }

    public int getTeleFonoProv() {
        return teleFonoProv;
    }

    public void setTeleFonoProv(int teleFonoProv) {
        this.teleFonoProv = teleFonoProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getEmialProv() {
        return emialProv;
    }

    public void setEmialProv(String emialProv) {
        this.emialProv = emialProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public String getRegionProv() {
        return regionProv;
    }

    public void setRegionProv(String regionProv) {
        this.regionProv = regionProv;
    }

    public String getProvivenciaProv() {
        return provivenciaProv;
    }

    public void setProvivenciaProv(String provivenciaProv) {
        this.provivenciaProv = provivenciaProv;
    }

    public String getComunaProv() {
        return comunaProv;
    }

    public void setComunaProv(String comunaProv) {
        this.comunaProv = comunaProv;
    }

    public LocalDate getFechaNacProv() {
        return FechaNacProv;
    }

    public void setFechaNacProv(LocalDate FechaNacProv) {
        this.FechaNacProv = FechaNacProv;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "numRazonSocialProv=" + numRazonSocialProv + ", dvRazonSocialprov=" + dvRazonSocialprov + ", teleFonoProv=" + teleFonoProv + ", nombreProv=" + nombreProv + ", emialProv=" + emialProv + ", direccionProv=" + direccionProv + ", regionProv=" + regionProv + ", provivenciaProv=" + provivenciaProv + ", comunaProv=" + comunaProv + ", FechaNacProv=" + FechaNacProv + '}';
    }
    
    
    
}
