import java.util.*;

public class Biblioteca {

	
	private final int topeLibros=1000;
	private List<Libro> libros;
	
	public Biblioteca() {
		this.libros= new ArrayList<>();
	}
	
public void agregarLibro(Libro libro) {
	if(libros.size()>= topeLibros) {
		descatalogarLibro(libro.getTematica());
	}
	libros.add(libro);
}

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
 
 public List<Libro> getLibros() {
     return libros;
 }

		
	
}

