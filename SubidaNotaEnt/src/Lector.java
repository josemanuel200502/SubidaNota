
public class Lector {

	private int id;
    private String nombre;
    private String direccion;
    private String tipo;

    public Lector(int id, String nombre, String direccion, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }
}

