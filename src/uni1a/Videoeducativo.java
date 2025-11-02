package uni1a;

public class Videoeducativo extends ContenidoAudiovisual {
    private String tema;
    private String autor;
    private int nivelEducativo; // 1: básico, 2: intermedio, 3: avanzado

    public Videoeducativo(String titulo, int duracionEnMinutos, String genero, String tema, String autor, int nivelEducativo) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.autor = autor;
        this.nivelEducativo = nivelEducativo;
    }

    public String getTema() {
        return tema;
    }

    public String getAutor() {
        return autor;
    }

    public int getNivelEducativo() {
        return nivelEducativo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video educativo:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Tema: " + tema);
        System.out.println("Autor: " + autor);
        System.out.println("Nivel educativo: " + nivelEducativo);
        System.out.println();
    }
}
