import java.util.Date;

public class Libro {

	private int id;
    private String titulo;
    private String autor;
    private String tematica;
    private Date fechaLlegada;
    private int ejemplares;

    public Libro(int id, String titulo, String autor, String tematica, Date fechaLlegada, int ejemplares) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
        this.fechaLlegada = fechaLlegada;
        this.ejemplares = ejemplares;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTematica() {
        return tematica;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public int getEjemplares() {
        return ejemplares;
    }
}

