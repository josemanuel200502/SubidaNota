package edfgdasg;
/**
 * Excepción lanzada cuando se intenta agregar un libro a una biblioteca que ya ha alcanzado su capacidad máxima.
 */
public class BibliotecaLlenaException extends Exception {

    /**
     * Crea una nueva instancia de BibliotecaLlenaException con un mensaje de error especificado.
     *
     * @param mensaje El mensaje de error.
     */
    public BibliotecaLlenaException(String mensaje) {
        super(mensaje);
    }
}
