package edfgdasg;
import java.util.Date;
/**
 * @author Jose Manuel Flores Marzo
 */


/**
 * Clase principal para demostrar el funcionamiento de la biblioteca municipal.
 */
public class Main {

    /**
     * El método principal donde se crean y manipulan los objetos de la biblioteca.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     * @throws BibliotecaLlenaException Si se intenta agregar un libro a una biblioteca llena.
     */
    public static void main(String[] args)throws BibliotecaLlenaException {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro(1, "Libro Infantil", "Autor 1", "infantil", new Date(), 2);
        Libro libro2 = new Libro(2, "Libro Narrativa", "Autor 2", "narrativa", new Date(), 1);
        Libro libro3 = new Libro(3, "Libro Poesía", "Autor 3", "poesía", new Date(), 1);
        Libro libro4 = new Libro(4, "Libro Tecnología", "Autor 4", "tecnología", new Date(), 1);
        Libro libro5 = new Libro(5, "Libro Terror", "Autor 5", "terror", new Date(), 1);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        // Crear lectores
        Lector lector1 = new Lector(1, "Juan Pérez", "Calle Falsa 123", "Convencional");
        Lector lector2 = new Lector(2, "María García", "Avenida Siempre Viva 742", "Convencional");
        Lector lector3 = new Lector(3, "Pedro Gómez", "Calle Luna 456", "Empleado");

        // Crear préstamos
        Date fechaPrestamo = new Date();
        Date fechaEntrega = new Date(fechaPrestamo.getTime() + (30L * 24 * 60 * 60 * 1000)); // 30 días después
        Prestamo prestamo1 = new Prestamo(1, libro1, lector1, fechaPrestamo, fechaEntrega);
        Prestamo prestamo2 = new Prestamo(2, libro2, lector2, fechaPrestamo, fechaEntrega);
        Prestamo prestamo3 = new Prestamo(3, libro3, lector3, fechaPrestamo, fechaEntrega);

        // Calcular penalización (simulación de retraso)
        Date fechaActual1 = new Date(fechaPrestamo.getTime() + (35L * 24 * 60 * 60 * 1000)); // 35 días después
        Date fechaActual2 = new Date(fechaPrestamo.getTime() + (40L * 24 * 60 * 60 * 1000)); // 40 días después
        Date fechaActual3 = new Date(fechaPrestamo.getTime() + (25L * 24 * 60 * 60 * 1000)); // 25 días después

        // Penalización para lector 1
        int diasRetraso1 = prestamo1.calcularPenalizacion(fechaActual1);
        float montoPenalizacion1 = diasRetraso1 * 0.5f; // Penalización de 0.5 unidades monetarias por día de retraso
        if (diasRetraso1 > 0) {
            Penalizacion penalizacion1 = new Penalizacion(lector1, diasRetraso1, montoPenalizacion1);
            System.out.println("Lector: " + penalizacion1.getLector().getNombre() +
                    ", Días de retraso: " + penalizacion1.getDiasRetraso() +
                    ", Monto de penalización: " + penalizacion1.getMonto());
        } else {
            System.out.println("No hay penalización para " + lector1.getNombre());
        }

        // Penalización para lector 2
        int diasRetraso2 = prestamo2.calcularPenalizacion(fechaActual2);
        float montoPenalizacion2 = diasRetraso2 * 0.5f; // Penalización de 0.5 unidades monetarias por día de retraso
        if (diasRetraso2 > 0) {
            Penalizacion penalizacion2 = new Penalizacion(lector2, diasRetraso2, montoPenalizacion2);
            System.out.println("Lector: " + penalizacion2.getLector().getNombre() +
                    ", Días de retraso: " + penalizacion2.getDiasRetraso() +
                    ", Monto de penalización: " + penalizacion2.getMonto());
        } else {
            System.out.println("No hay penalización para " + lector2.getNombre());
        }

        // Penalización para lector 3 (sin penalización)
        int diasRetraso3 = prestamo3.calcularPenalizacion(fechaActual3);
        float montoPenalizacion3 = diasRetraso3 * 0.5f; // Penalización de 0.5 unidades monetarias por día de retraso
        if (diasRetraso3 > 0) {
            Penalizacion penalizacion3 = new Penalizacion(lector3, diasRetraso3, montoPenalizacion3);
            System.out.println("Lector: " + penalizacion3.getLector().getNombre() +
                    ", Días de retraso: " + penalizacion3.getDiasRetraso() +
                    ", Monto de penalización: " + penalizacion3.getMonto());
        } else {
            System.out.println("No hay penalización para " + lector3.getNombre());
        }
    }
}
