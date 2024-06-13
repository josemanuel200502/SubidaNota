
public class Penalizacion {

	private Lector lector;
    private int diasRetraso;
    private float monto;

    public Penalizacion(Lector lector, int diasRetraso, float monto) {
        this.lector = lector;
        this.diasRetraso = diasRetraso;
        this.monto = monto;
    }

    public Lector getLector() {
        return lector;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public float getMonto() {
        return monto;
    }
}
