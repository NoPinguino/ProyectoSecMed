package model.entities;

/**
 * Clase abstracta que representa a un miembro del personal sanitario.
 * <p>
 *     Hereda los métodos y atributos de {@code Usuario}, además dispone de un número de colegiado.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public abstract class PersonalSanitario extends Usuario {
    /**
     * Número de colegiado
     */
    protected String numeroColegiado;

    /**
     * Construye un objeto {@code PersonalSanitario}
     *
     * @param nombre Nombre completo
     * @param dni Documento nacional de identidad
     * @param email Correo electrónico
     * @param direccion Dirección postal
     * @param username Nombre de usuario en el sistema
     * @param passwordHash Hash de la contraseña
     * @param salt Salt utilizada para generar el hash
     * @param numeroColegiado Número de colegiado
     */
    public PersonalSanitario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.numeroColegiado = numeroColegiado;
    }

    /**
     * Devuelve el número de colegiado.
     *
     * @return Número de colegiado.
     */
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    /**
     * Asigna un número de colegiado.
     *
     * @param numeroColegiado Número de colegiado a asignar.
     */
    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
}
