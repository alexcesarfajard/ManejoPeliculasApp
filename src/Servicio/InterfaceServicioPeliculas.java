package Servicio;

import Dominio.Pelicula;

public interface InterfaceServicioPeliculas {
    
    public void listarPeliculas();
    
    public void agregarPelicula(Pelicula pe);
    
    public void buscarPelicula(Pelicula pe);
    
}
