package model.entities;

/**
 * Representa un usuario administrativo en el sistema.
 * <p>
 *     Un administrativo puede hacer gestiones a los pacientes, como asignarles un médico y/o pruebas médicas.
 * </p>
 */
public class Administrativo extends Usuario {
    private String idAdministrativo;

    /**
     * Construye un objeto {@code Administrativo}
     *
     * @param nombre Nombre completo del administrativo
     * @param dni Documento nacional de identidad
     * @param email Correo electrónico
     * @param direccion Dirección postal
     * @param username Nombre de usuario en el sistema
     * @param passwordHash Hash de la contraseña
     * @param salt Salt utilizada para generar el hash
     * @param idAdministrativo Identificador del administrativo
     */
    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.idAdministrativo = idAdministrativo;
    }
    /**
     * Devuelve el identificador del administrativo.
     *
     * @return id del administrativo
     */
    public String getIdAdministrativo() {
        return idAdministrativo;
    }
    /**
     * Establece el identificador del administrativo.
     *
     * @param idAdministrativo nuevo identificador.
     */
    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    /**
     * Asigna un médico a un paciente.
     *
     * @param paciente Objeto paciente
     * @param medico Objeto médico
     */
    public void asignarMedico(Paciente paciente, Medico medico) {
        paciente.setMedicoAsignado(medico);
    }

    /**
     * Añade una prueba médica al historial de un paciente.
     *
     * @param paciente Objeto paciente
     * @param pruebaMedica Objeto PruebaMedica
     */
    public void asignarPrueba(Paciente paciente, PruebaMedica pruebaMedica) {
        paciente.getHistorial().agregarEntrada(pruebaMedica);
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return representación de objeto {@code Administrativo}
     */
    @Override
    public String toString() {
        return  "Objeto Administrativo {\n" +
                " idAdministrativo = '" + idAdministrativo + "',\n" +
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
