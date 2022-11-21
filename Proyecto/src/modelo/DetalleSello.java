/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class DetalleSello {
    private int codProducto;
    private String codSello;

    public DetalleSello() {
    }

    public DetalleSello(int codProducto, String codSello) {
        this.codProducto = codProducto;
        this.codSello = codSello;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getCodSello() {
        return codSello;
    }

    public void setCodSello(String codSello) {
        this.codSello = codSello;
    }

    @Override
    public String toString() {
        return "DetalleSello{" + "codProducto=" + codProducto + ", codSello=" + codSello + '}';
    }
    
    
}
