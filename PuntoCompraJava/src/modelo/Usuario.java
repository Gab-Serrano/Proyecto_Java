/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class Usuario {
    private int codUsuario, numRutUsuario;
    private String dvRutUsuario, pNombreUsuario, pApellidoUsuario, sApellidoUsuario, emailUsuario;

    public Usuario() {
    }

    public Usuario(int codUsuario, int numRutUsuario, String dvRutUsuario, String pNombreUsuario, String pApellidoUsuario, String sApellidoUsuario, String emailUsuario) {
        this.codUsuario = codUsuario;
        this.numRutUsuario = numRutUsuario;
        this.dvRutUsuario = dvRutUsuario;
        this.pNombreUsuario = pNombreUsuario;
        this.pApellidoUsuario = pApellidoUsuario;
        this.sApellidoUsuario = sApellidoUsuario;
        this.emailUsuario = emailUsuario;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getNumRutUsuario() {
        return numRutUsuario;
    }

    public void setNumRutUsuario(int numRutUsuario) {
        this.numRutUsuario = numRutUsuario;
    }

    public String getDvRutUsuario() {
        return dvRutUsuario;
    }

    public void setDvRutUsuario(String dvRutUsuario) {
        this.dvRutUsuario = dvRutUsuario;
    }

    public String getpNombreUsuario() {
        return pNombreUsuario;
    }

    public void setpNombreUsuario(String pNombreUsuario) {
        this.pNombreUsuario = pNombreUsuario;
    }

    public String getpApellidoUsuario() {
        return pApellidoUsuario;
    }

    public void setpApellidoUsuario(String pApellidoUsuario) {
        this.pApellidoUsuario = pApellidoUsuario;
    }

    public String getsApellidoUsuario() {
        return sApellidoUsuario;
    }

    public void setsApellidoUsuario(String sApellidoUsuario) {
        this.sApellidoUsuario = sApellidoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codUsuario=" + codUsuario + ", numRutUsuario=" + numRutUsuario + ", dvRutUsuario=" + dvRutUsuario + ", pNombreUsuario=" + pNombreUsuario + ", pApellidoUsuario=" + pApellidoUsuario + ", sApellidoUsuario=" + sApellidoUsuario + ", emailUsuario=" + emailUsuario + '}';
    }
    
    
}
