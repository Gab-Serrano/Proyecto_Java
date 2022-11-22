/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nearQ
 */
public class Comuna {
    
    private int codComuna,codProvincia,codRegion;
    private String nomComuna;

    public Comuna() {
    }

    public Comuna(int codComuna, int codProvincia, int codRegion, String nomComuna) {
        this.codComuna = codComuna;
        this.codProvincia = codProvincia;
        this.codRegion = codRegion;
        this.nomComuna = nomComuna;
    }

    public int getCodComuna() {
        return codComuna;
    }

    public void setCodComuna(int codComuna) {
        this.codComuna = codComuna;
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

    public String getNomComuna() {
        return nomComuna;
    }

    public void setNomComuna(String nomComuna) {
        this.nomComuna = nomComuna;
    }
    
    
    
}
