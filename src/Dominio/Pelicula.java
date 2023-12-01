package Dominio;

import java.util.Objects;

public class Pelicula {
    
    private String nombre;
    private String genero;
    
    //constructor vacio
    public Pelicula(){}
    
    //constructor
    public Pelicula(String nombre, String genero){
        this.nombre = nombre;
        this.genero = genero;
    }
    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //toString
    @Override
    public String toString() {
        return "Pelicula: " + "nombre = " + nombre + ", genero = " + genero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.genero, other.genero);
    }
}
