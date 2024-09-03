import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));

        List<Pelicula> peliculasSigloXXI = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .collect(Collectors.toList());

        System.out.println("\n-----------------------------------------\n");

        System.out.println("\n 1 -- Películas estrenadas en el siglo XXI (a partir del año 2000, inclusive) : \n");
        peliculasSigloXXI.forEach(System.out::println);

        System.out.println("\n-----------------------------------------\n");


        System.out.println("\n 2 --  Títulos de las películas de Steven Spielberg, separados por comas: \n");
        String titulosPeliculasSpielberg = peliculas.stream()
                .filter(p -> "Steven Spielberg".equals(p.getDirector()))
                .map(Pelicula::getTitulo)
                .collect(Collectors.joining(", ", "Películas de Steven Spielberg: ", ""));

        System.out.println(titulosPeliculasSpielberg);

        System.out.println("\n-----------------------------------------\n");


        List<String> peliculasOrdenadas = peliculas.stream()
                .map(Pelicula::getTitulo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n 3 -- Nombres de películas ordenados alfabéticamente: \n");
        peliculasOrdenadas.forEach(System.out::println);

        System.out.println("\n-----------------------------------------\n");

    }
}

