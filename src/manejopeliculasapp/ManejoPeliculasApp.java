package manejopeliculasapp;

import Dominio.Pelicula;
import Servicio.ServicioPeliculas;
import Servicio.InterfaceServicioPeliculas;
import java.util.Scanner;

public class ManejoPeliculasApp {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        //creamos el objeto de servicio que se encarga del manejo de las peliculas 
        InterfaceServicioPeliculas servicioPelicula = new ServicioPeliculas();

        //creamos algunos objetos de tipo pelicula
        Pelicula p1 = new Pelicula("Batman", "Ficcion");
        Pelicula p2 = new Pelicula("Superman", "Ficcion");
        Pelicula p3 = new Pelicula("Avengers", "Ficcion");
        Pelicula p4 = new Pelicula("Iron man", "Accion");
        Pelicula p5 = new Pelicula("Indiana Jons", "Aventuras");

        //agregamos las peliculas a la lista
        servicioPelicula.agregarPelicula(p1);
        servicioPelicula.agregarPelicula(p2);
        servicioPelicula.agregarPelicula(p3);
        servicioPelicula.agregarPelicula(p4);
        servicioPelicula.agregarPelicula(p5);

        /*
        //Listamos las peliculas que ya tenemos agregadas
        servicioPelicula.listarPeliculas();
        
        //buscamos una pelicula
        //se debe implementar el metodo equals y hashcode 
        servicioPelicula.buscarPelicula(new Pelicula("Indiana Jons", "Aventuras"));
         */
        System.out.println("\n\n\n\n");

        String nombre;
        String genero;
        int opc = 0;

        while (opc != 4) {
            mostrarMenu();
            mensaje("\nPor favor ingrese una opcion: ");
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                mensaje("Ha ocurrido un error: " + e.getMessage());
                opc = 99;
            }

            switch (opc) {
                case 1:
                    mensaje("\nVamos a agregar una pelicula\nPor favor digite el nombre: ");
                    nombre = sc.nextLine();
                    mensaje("Por favor digite el genero: ");
                    genero = sc.nextLine();

                    servicioPelicula.agregarPelicula(new Pelicula(nombre, genero));
                    mensaje("Ingrese enter para continuar...");
                    sc.nextLine();
                    break;
                case 2:
                    servicioPelicula.listarPeliculas();
                    mensaje("Ingrese enter para continuar...");
                    sc.nextLine();
                    break;
                case 3:
                    mensaje("\nVamos a buscar una pelicula\nPor favor digite el nombre: ");
                    nombre = sc.nextLine();
                    mensaje("Por favor digite el genero: ");
                    genero = sc.nextLine();

                    servicioPelicula.buscarPelicula(new Pelicula(nombre, genero));
                    mensaje("Ingrese enter para continuar...");
                    sc.nextLine();
                    break;
                case 4:
                    mensaje("\nGracias por utilizar este servicio...\nPresione enter para continuar...");
                    sc.nextLine();
                    break;
                default:
                    mensaje("\nNo se ha elegido una opcion correcta...\nPresione enter para continuar...");
                    sc.nextLine();
            }

        }
    }

    //void para mostrar menu
    private static void mostrarMenu() {
        System.out.println("*** Manejo de Peliculas App");
        System.out.println("1. Agregar peliculas \n2. Listar peliculas\n3. Buscar pelicula\n4. Salir");
    }

    private static void mensaje(String mensaje) {
        System.out.print(mensaje);
    }

}
