package uni1a;

public class Main {
    public static void main(String[] args) {

        // --- Película y actores ---
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        Actor actor1 = new Actor("Leonardo DiCaprio", 49, pelicula);
        Actor actor2 = new Actor("Joseph Gordon-Levitt", 43, pelicula);

        pelicula.mostrarDetalles();
        actor1.mostrarInfo();
        actor2.mostrarInfo();

        // --- Serie y temporadas ---
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 60, "Drama", 5);
        Temporada t1 = new Temporada(1, 7);
        Temporada t2 = new Temporada(2, 10);

        // Asegúrate de tener este método en SerieDeTV
        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);

        serie.mostrarDetalles();

        // --- Documental e investigador ---
        Documental documental = new Documental("Vida Salvaje", 90, "Naturaleza");
        Investigador investigador = new Investigador("Jane Goodall", documental);
        investigador.mostrarInfo();

        // --- Subclases nuevas ---
        Cortometraje corto = new Cortometraje("El Viaje", 25, "Drama", "Carlos Pérez", true);
        Actor actorCorto = new Actor("Ana Torres", 30, corto); // Asociación entre Actor y Cortometraje

        Videoeducativo video = new Videoeducativo("Aprendiendo Java", 45, "Educativo", "POO en Java", "Luis Herrera", 2);
        Investigador investigadorVideo = new Investigador("Dr. Salazar", new Documental("El mundo del codigo", 90, "Tecnologia"));

        corto.mostrarDetalles();
        video.mostrarDetalles();
        actorCorto.mostrarInfo();
        investigadorVideo.mostrarInfo();
    }
}
