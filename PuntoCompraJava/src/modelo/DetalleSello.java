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
    private int codProducto,codSello;
    
    public DetalleSello() {
    }

    public DetalleSello(int codProducto, int codSello) {
        this.codProducto = codProducto;
        this.codSello = codSello;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCodSello() {
        return codSello;
    }

    public void setCodSello(int codSello) {
        this.codSello = codSello;
    }

    
    
    
}
