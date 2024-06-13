package edfgdasg;
/**
 * Representa una penalización por retraso en la devolución de un libro.
 */
public class Penalizacion {

    private Lector lector;
    private int diasRetraso;
    private float monto;

    /**
     * Crea una instancia de Penalizacion.
     *
     * @param lector      El lector que ha incurrido en la penalización.
     * @param diasRetraso Los días de retraso en la devolución.
     * @param monto       El monto total de la penalización.
     */
    public Penalizacion(Lector lector, int diasRetraso, float monto) {
        this.lector = lector;
        this.diasRetraso = diasRetraso;
        this.monto = monto;
    }

    /**
     * Obtiene el lector que ha incurrido en la penalización.
     *
     * @return El lector.
     */
    public Lector getLector() {
        return lector;
    }

    /**
     * Obtiene los días de retraso en la devolución.
     *
     * @return Los días de retraso.
     */
    public int getDiasRetraso() {
        return diasRetraso;
    }

    /**
     * Obtiene el monto total de la penalización.
     *
     * @return El monto de la penalización.
     */
    public float getMonto() {
        return monto;
    }
}
