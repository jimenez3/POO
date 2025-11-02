package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {

    private String estudio; // Nombre del estudio productor
    private List<Actor> actores; // Asociación: una película tiene varios actores

    // Constructor
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    // Getters y Setters
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<Actor> getActores() {
        return actores;
    }

    // Método para agregar actores (asociación)
    public void agregarActor(Actor actor) {
        if (actor != null) {
            actores.add(actor);
        }
    }

    // Sobrescritura del método mostrarDetalles()
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);

        if (!actores.isEmpty()) {
            System.out.println("Actores principales:");
            for (Actor a : actores) {
     
            }
        }
        System.out.println();
    }
}
