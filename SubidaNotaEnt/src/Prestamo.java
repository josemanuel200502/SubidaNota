import java.util.Date;

public class Prestamo {

	 private int id;
	    private Libro libro;
	    private Lector lector;
	    private Date fechaPrestamo;
	    private Date fechaEntrega;

	    public Prestamo(int id, Libro libro, Lector lector, Date fechaPrestamo, Date fechaEntrega) {
	        this.id = id;
	        this.libro = libro;
	        this.lector = lector;
	        this.fechaPrestamo = fechaPrestamo;
	        this.fechaEntrega = fechaEntrega;
	    }

	    public int getId() {
	        return id;
	    }

	    public Libro getLibro() {
	        return libro;
	    }

	    public Lector getLector() {
	        return lector;
	    }

	    public Date getFechaPrestamo() {
	        return fechaPrestamo;
	    }

	    public Date getFechaEntrega() {
	        return fechaEntrega;
	    }

	    public int calcularPenalizacion(Date fechaActual) {
	        long diff = fechaActual.getTime() - fechaEntrega.getTime();
	        int diasRetraso = (int) (diff / (1000 * 60 * 60 * 24));
	        if (diasRetraso > 0) {
	            return diasRetraso; // Penalización simple en días de retraso
	        }
	        return 0;
	    }
	}
