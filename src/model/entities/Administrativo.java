package model.entities;

public class Administrativo extends Usuario {
    private String idAdministrativo;

    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.idAdministrativo = idAdministrativo;
    }
    /* Setter & Getter: -String idAdministrativo */
    public String getIdAdministrativo() {
        return idAdministrativo;
    }
    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    /**
     * Accedemos a una instancia de paciente y le asignamos una instancia de médico en el parámetro medicoAsignado
     * @param paciente Objeto paciente
     * @param medico Objeto médico
     */
    public void asignarMedico(Paciente paciente, Medico medico) {
        paciente.setMedicoAsignado(medico);
    }

    /**
     * Accedemos a una instancia de paciente, a su historial asignado, y añadimos una prueba en el historial.
     * @param paciente Objeto paciente
     * @param pruebaMedica Objeto PruebaMedica
     */
    public void asignarPrueba(Paciente paciente, PruebaMedica pruebaMedica) {
        paciente.getHistorial().agregarEntrada(pruebaMedica);
    }

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
