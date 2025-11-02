
package uni1a;

public class Actor {
    private String nombre;
    private int edad;
    private Pelicula pelicula;
    private Cortometraje cortometraje; // Asociación adicional

    // Constructor para Película
    public Actor(String nombre, int edad, Pelicula pelicula) {
        this.nombre = nombre;
        this.edad = edad;
        this.pelicula = pelicula;
    }

    // Constructor para Cortometraje
    public Actor(String nombre, int edad, Cortometraje cortometraje) {
        this.nombre = nombre;
        this.edad = edad;
        this.cortometraje = cortometraje;
    }

    public void mostrarInfo() {
        System.out.println("Actor: " + nombre + " (" + edad + " años)");
        if (pelicula != null) {
            System.out.println("Participa en la película: " + pelicula.getTitulo());
        } else if (cortometraje != null) {
            System.out.println("Participa en el cortometraje: " + cortometraje.getTitulo());
        }
        System.out.println();
    }
}
