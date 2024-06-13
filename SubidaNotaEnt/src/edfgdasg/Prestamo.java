package edfgdasg;
import java.util.Date;

/**
 * Representa un préstamo de un libro a un lector en la biblioteca.
 * Cada préstamo tiene un identificador, libro, lector, fecha de préstamo y fecha de entrega.
 */
public class Prestamo {

    private int id;
    private Libro libro;
    private Lector lector;
    private Date fechaPrestamo;
    private Date fechaEntrega;

    /**
     * Crea una nueva instancia de Prestamo con los datos especificados.
     *
     * @param id El identificador único del préstamo.
     * @param libro El libro prestado.
     * @param lector El lector que realiza el préstamo.
     * @param fechaPrestamo La fecha en que se realiza el préstamo.
     * @param fechaEntrega La fecha en que se debe devolver el libro.
     */
    public Prestamo(int id, Libro libro, Lector lector, Date fechaPrestamo, Date fechaEntrega) {
        this.id = id;
        this.libro = libro;
        this.lector = lector;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene el identificador único del préstamo.
     *
     * @return El identificador del préstamo.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el libro prestado.
     *
     * @return El libro del préstamo.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Obtiene el lector que realiza el préstamo.
     *
     * @return El lector del préstamo.
     */
    public Lector getLector() {
        return lector;
    }

    /**
     * Obtiene la fecha en que se realiza el préstamo.
     *
     * @return La fecha del préstamo.
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Obtiene la fecha en que se debe devolver el libro.
     *
     * @return La fecha de entrega del préstamo.
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Calcula la penalización en días de retraso basado en la fecha actual.
     *
     * @param fechaActual La fecha actual para comparar con la fecha de entrega.
     * @return El número de días de retraso, o 0 si no hay retraso.
     */
    public int calcularPenalizacion(Date fechaActual) {
        long diff = fechaActual.getTime() - fechaEntrega.getTime();
        int diasRetraso = (int) (diff / (1000 * 60 * 60 * 24));
        if (diasRetraso > 0) {
            return diasRetraso; // Penalización simple en días de retraso
        }
        return 0;
    }
}

