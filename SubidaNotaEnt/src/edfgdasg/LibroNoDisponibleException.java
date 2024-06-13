package edfgdasg;


/**
 * Excepción lanzada cuando se intenta prestar un libro que no está disponible.
 */
public class LibroNoDisponibleException extends Exception {
    public LibroNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}