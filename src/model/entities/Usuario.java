package model.entities;

/**
 * Representación de personas tipo {@code Usuario}
 * <p>
 *     Hereda atributos y métodos de {@code Persona} y a ellos añade el nombre de usuario dentro del sistema, el
 *     hash de la contraseña y el salt utilizado para generar ese hash.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public class Usuario extends Persona {
    /**
     * Nombre de usuario en el sistema.
     */
    protected String username;
    /**
     * Hash de la contraseña.
     */
    protected String passwordHash;
    /**
     * Salt utilizado para generar el hash.
     */
    protected String salt;

    /**
     * Construye un objeto {@code Usuario}
     *
     * @param nombre Nombre completo
     * @param dni Documento nacional de identidad.
     * @param email Correo electrónico.
     * @param direccion Dirección postal.
     * @param username Nombre de usuario en el sistema.
     * @param passwordHash Hash de la contraseña.
     * @param salt Salt utilizada para generar el hash.
     */
    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    /**
     * Devuelve el nombre de usuario en el sistema.
     *
     * @return Nombre de usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Asigna un nombre de usuario en el sistema.
     *
     * @param username Nombre de usuario a asignar.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Devuelve el hash de la contraseña.
     *
     * @return Hash de la contraseña.
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Asigna un hash de contraseña al usuario.
     *
     * @param passwordHash Hash de contraseña a asignar.
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Devuelve el salt utilizado para generar el hash de la contraseña.
     *
     * @return Salt utilizado para generar el hash de constraseña.
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Asigna el salt utilizado para generar la contraseña.
     *
     * @param salt Salt utilizado para generar la contraseña.
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return Representación de objeto {@code Usuario}
     */
    @Override
    public String toString() {
        return  "Objeto Usuario {\n" +
                " username = '" + username + "',\n" +
                " passwordHash = '" + passwordHash + "',\n" +
                " salt = '" + salt + "',\n" +
                " nombre = '" + nombre + "',\n" +
                " dni = '" + dni + "',\n" +
                " email = '" + email + "',\n" +
                " direccion = '" + direccion + "'\n" +
                '}';
    }
}
