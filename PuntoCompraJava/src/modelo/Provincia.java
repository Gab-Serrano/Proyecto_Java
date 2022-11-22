/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nearQ
 */
public class Provincia {
    
    private int codProvincia,codRegion;
    private String nomProvincia;

    public Provincia() {
    }

    public Provincia(int codProvincia, int codRegion, String nomProvincia) {
        this.codProvincia = codProvincia;
        this.codRegion = codRegion;
        this.nomProvincia = nomProvincia;
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    public String getNomProvincia() {
        return nomProvincia;
    }

    public void setNomProvincia(String nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    
    
    
    
}
