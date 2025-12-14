package model.entities;

/**
 * Clase abstracta que representa una persona.
 * <p>
 *     Clase abstracta de la que hereda {@code Usuario} y {@code Paciente}, representa a una persona con sus datos,
 *     como nombre, dni, email y dirección postal.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public abstract class Persona {
    /**
     * Nombre completo.
     */
    protected String nombre;
    /**
     * Documento nacional de identidad.
     */
    protected String dni;
    /**
     * Correo electrónico.
     */
    protected String email;
    /**
     * Dirección postal.
     */
    protected String direccion;

    /**
     * Construye un objeto {@code Persona}
     *
     * @param nombre Nombre completo
     * @param dni Documento nacional de identidad.
     * @param email Correo electrónico
     * @param direccion Dirección postal.
     */
    public Persona(String nombre, String dni, String email, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
    }

    /**
     * Devuelve el nombre de una persona.
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nombre a una persona.
     *
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el dni asociado una persona.
     *
     * @return Dni de la persona.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Asigna un dni a una persona.
     *
     * @param dni Dni a asignar.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el correo electrónico de una persona.
     *
     * @return Correo electrónico de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Asigna un correo electrónico a una persona.
     *
     * @param email Correo electrónico a asignar.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve la dirección postal de una persona.
     *
     * @return Dirección postal de una persona.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Asigna una dirección postal a una persona.
     *
     * @param direccion Dirección a asignar.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return Representación de objeto {@code Persona}
     */
    @Override
    public String toString() {
        return  "Objeto Persona {\n" +
                " nombre = '" + nombre + "',\n" +
                " dni = '" + dni + "',\n" +
                " email = '" + email + "',\n" +
                " direccion = '" + direccion + "'\n" +
                '}';
    }
}
