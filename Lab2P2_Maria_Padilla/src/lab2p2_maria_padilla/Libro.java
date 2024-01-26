/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_maria_padilla;

/**
 *
 * @author belen
 */
public class Libro {
    String titulo,autor,genero,year,disponibilidad;

    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, String year, String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.year = year;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", year=" + year + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
}
