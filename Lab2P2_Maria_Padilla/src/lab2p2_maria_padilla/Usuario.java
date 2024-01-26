/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_maria_padilla;

/**
 *
 * @author belen
 */
public class Usuario {
    String nombre,contra,tipoUsuario;

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String nombre, String contra, String tipoUsuario) {
        this.nombre = nombre;
        this.contra = contra;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }
    
}
