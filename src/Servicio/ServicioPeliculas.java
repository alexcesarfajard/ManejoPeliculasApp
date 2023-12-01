package Servicio;

import Dominio.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculas implements InterfaceServicioPeliculas{
    
    private final List<Pelicula> peliculas;
    
    public ServicioPeliculas(){
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("\n\n*** Listado de peliculas ***");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pe) {
        peliculas.add(pe);
        System.out.println("Se agregó la " + pe);
    }

    @Override
    public void buscarPelicula(Pelicula pe) {
        int indice = peliculas.indexOf(pe);
        
        if (indice >= 0){
            System.out.println("\n\nLa pelicula se ha encontrado en el indice: " + indice);
        } else if (indice == -1){
            System.out.println("\n\nLa pelicula no se ha encontrado: " + pe);
        }
    }
    
}
