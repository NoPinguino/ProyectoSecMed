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
     *
     * @param paciente
     * @param pruebaMedica
     */
    public void asignarPrueba(Paciente paciente, PruebaMedica pruebaMedica) {
        // paciente.getHistorial().
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
