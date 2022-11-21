/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class Categoria {
    private int codCategoria;
    private String nombrecategoria;

    public Categoria() {
    }

    public Categoria(int codCategoria, String nombrecategoria) {
        this.codCategoria = codCategoria;
        this.nombrecategoria = nombrecategoria;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codCategoria=" + codCategoria + ", nombrecategoria=" + nombrecategoria + '}';
    }
    
}
