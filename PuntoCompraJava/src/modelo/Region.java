/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nearQ
 */
public class Region {
    
    private int codRegion;
    private String nomRegion;

    public Region() {
    }

    public Region(int codRegion, String nomRegion) {
        this.codRegion = codRegion;
        this.nomRegion = nomRegion;
    }

    public int getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(int codRegion) {
        this.codRegion = codRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
    
    
    
}
