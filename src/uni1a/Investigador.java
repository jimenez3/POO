package uni1a;

public class Investigador {
    private String nombre;
    private Documental documental; // Composición: el investigador pertenece al documental

    public Investigador(String nombre, Documental documental) {
        this.nombre = nombre;
        this.documental = documental;
    }

    public String getNombre() {
        return nombre;
    }

    public Documental getDocumental() {
        return documental;
    }

    public void setDocumental(Documental documental) {
        this.documental = documental;
    }

    public void mostrarInfo() {
        System.out.println("Investigador: " + nombre);
        if (documental != null) {
            System.out.println("Relacionado con el documental: " + documental.getTitulo());
        } else {
            System.out.println("No está asociado a ningún documental actualmente.");
        }
        System.out.println();
    }
}
