/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_maria_padilla;

/**
 *
 * @author belen
 */
public class CursoEnLinea {
    String titulo,instructor,duracion,plataformas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public CursoEnLinea(String titulo, String instructor, String duracion, String plataformas) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracion = duracion;
        this.plataformas = plataformas;
    }

    public CursoEnLinea() {
    }
}
