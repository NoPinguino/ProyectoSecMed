package model.entities;
import model.enums.Especialidad;

/**
 * Clase que representa un usuario del personal sanitario de tipo Médico
 * <p>
 *  Un médico pertenece al personal sanitario, por lo tanto, hereda sus atributos y métodos, sumado a ello dispone
 *  de una especialidad médica.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public class Medico extends PersonalSanitario {
    /**
     * Especialidad del médico.
     */
    private Especialidad especialidad;

    /**
     * Construye un objeto {@code Medico}
     *
     * @param nombre Nombre completo del médico
     * @param dni Documento nacional de identidad.
     * @param email Correo electrónico.
     * @param direccion Dirección postal.
     * @param username Nombre de usuario en el sistema.
     * @param passwordHash Hash de la contraseña.
     * @param salt Salt utilizada para generar el hash.
     * @param numeroColegiado Número de colegiado del médico.
     * @param especialidad Especialidad del médico.
     */
    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }

    /**
     * Devuelve la especialidad del médico.
     *
     * @return especialidad del médico.
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Asigna una especialidad al médico.
     *
     * @param especialidad Especialidad a asignar.
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return representación de objeto {@code Medico}
     */
    @Override
    public String toString() {
        return  "Objeto Medico {\n" +
                " especialidad = '" + especialidad + "',\n" +
                " numeroColegiado = '" + numeroColegiado + "',\n" +
                " username = '" + username + "',\n" +
                " passwordHash = '" + passwordHash + "',\n"+
                " salt = '" + salt + "',\n" +
                " nombre = '" + nombre + "',\n" +
                " dni = '" + dni + "',\n" +
                " email = '" + email + "',\n" +
                " direccion = '" + direccion + "'\n" +
                '}';
    }
}
