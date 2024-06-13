package edfgdasg;

/**
 * Representa un lector en la biblioteca.
 * Cada lector tiene un identificador, nombre, dirección y tipo (convencional o empleado).
 */

public class Lector {

	private int id;
    private String nombre;
    private String direccion;
    private String tipo;
    
    /**
     * Crea una nueva instancia de Lector con los datos especificados.
     *
     * @param id El identificador único del lector.
     * @param nombre El nombre del lector.
     * @param direccion La dirección postal del lector.
     * @param tipo El tipo de lector (convencional o empleado).
     */
    

    public Lector(int id, String nombre, String direccion, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    /**
     * Obtiene el identificador único del lector.
     *
     * @return El identificador del lector.
     */

    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del lector.
     *
     * @return El nombre del lector.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la dirección postal del lector.
     *
     * @return La dirección del lector.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el tipo de lector (convencional o empleado).
     *
     * @return El tipo del lector.
     */
    public String getTipo() {
        return tipo;
    }
}

