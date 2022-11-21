/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class Sello {
    private int codSello;
    private String tipoSello;

    public Sello() {
    }

    public Sello(int codSello, String tipoSello) {
        this.codSello = codSello;
        this.tipoSello = tipoSello;
    }

    public int getCodSello() {
        return codSello;
    }

    public void setCodSello(int codSello) {
        this.codSello = codSello;
    }

    public String getTipoSello() {
        return tipoSello;
    }

    public void setTipoSello(String tipoSello) {
        this.tipoSello = tipoSello;
    }

    @Override
    public String toString() {
        return "Sello{" + "codSello=" + codSello + ", tipoSello=" + tipoSello + '}';
    }
    
}
