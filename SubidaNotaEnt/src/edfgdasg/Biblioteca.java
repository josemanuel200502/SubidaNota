package edfgdasg;
import java.util.*;

/**
 * Representa una biblioteca con un límite máximo de libros.
 * Permite agregar libros y descatalogar el libro más antiguo cuando se excede el límite.
 */
public class Biblioteca {

	//Límite máximo de libros que la biblioteca puede albergar.
	private final int topeLibros=1000;
	private List<Libro> libros;
	
	/**
	 * Crea una nueva instancia de la biblioteca con una lista vacía de libros.
	 */
	public Biblioteca() {
		this.libros= new ArrayList<>();
	}
	
/**
 * Agrega un libro a la biblioteca. Si se excede el límite de libros, se descataloga
 * el libro más antiguo de la misma temática para hacer espacio. 
 * 
 * @param libro El libro a agregar
 * @throws BibliotecaLlenaException Si la biblioteca ha alcanzado su tope de libros.
 */
	
public void agregarLibro(Libro libro)throws BibliotecaLlenaException {
	if(libros.size()>= topeLibros) {
		descatalogarLibro(libro.getTematica());
		throw new BibliotecaLlenaException("La biblioteca ha alcanzado su tope de libros.");
	}
	libros.add(libro);
}

/**
 * Descataloga el libro más antiguo de una temática específica.
 *
 * @param tematica La temática del libro a descatalogar.
 */


private void descatalogarLibro(String tematica) {
	Libro libroMasViejo=null;
	for(Libro libro : libros) {
		if(libro.getTematica().equals(tematica)) {
			 if (libroMasViejo == null || libro.getFechaLlegada().before(libroMasViejo.getFechaLlegada())) {
                 libroMasViejo = libro;
             }
         }
     }
     if (libroMasViejo != null) {
         libros.remove(libroMasViejo);
     }
 }
 

/**
 *  Presta un libro a un lector si el libro está disponible
 *  
 * @param libro El libro a prestar.
 * @throws LibroNoDisponibleException
 */

public void prestarLibro(Libro libro)  throws LibroNoDisponibleException{
	
	if(!libros.contains(libro)) {
		throw new LibroNoDisponibleException("El libro no está disponible");
	}
}



/**
 * Obtiene la lista de libros actualmente en la biblioteca.
 * 
 * @return Una lista de libros.
 */
 public List<Libro> getLibros() {
     return libros;
 }

		
	
}

