package edfgdasg;
import java.util.Date;

/**
 * Representa un libro en la biblioteca.
 * Cada libro tiene un identificador, título, autor, temática, fecha de llegada y número de ejemplares.
 */
public class Libro {

	private int id;
    private String titulo;
    private String autor;
    private String tematica;
    private Date fechaLlegada;
    private int ejemplares;

    /**
     * Crea una nueva instancia de Libro con los datos especificados.
     *
     * @param id El identificador único del libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param tematica La temática del libro.
     * @param fechaLlegada La fecha de llegada del libro a la biblioteca.
     * @param ejemplares El número de ejemplares disponibles del libro.
     */
    public Libro(int id, String titulo, String autor, String tematica, Date fechaLlegada, int ejemplares) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
        this.fechaLlegada = fechaLlegada;
        this.ejemplares = ejemplares;
    }

    /**
     * Obtiene el identificador único del libro.
     *
     * @return El identificador del libro.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }


    /**
     * Obtiene la temática del libro.
     *
     * @return La temática del libro.
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * Obtiene la fecha de llegada del libro a la biblioteca.
     *
     * @return La fecha de llegada del libro.
     */
    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Obtiene el número de ejemplares disponibles del libro.
     *
     * @return El número de ejemplares del libro.
     */
    public int getEjemplares() {
        return ejemplares;
    }
}

