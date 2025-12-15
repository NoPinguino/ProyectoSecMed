package model.entities;

/**
 * Clase que representa un paciente.
 * <p>
 *     Paciente extiende de persona, contando con sus atributos y métodos, además, dispone de un historial médico y
 *     tiene un médico asignado.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public class Paciente extends Persona {
    private HistorialMedico historial;
    private Medico medicoAsignado;

    /**
     * Construye un objeto {@code Paciente}
     *
     * @param nombre Nombre completo del paciente.
     * @param dni Documento nacional de identidad.
     * @param email Correo electrónico.
     * @param direccion Dirección postal.
     */
    public Paciente(String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion);
        this.historial = new HistorialMedico();
    }

    /**
     * Devuelve el historial del paciente.
     *
     * @return historial médico del paciente.
     */
    public HistorialMedico getHistorial() {
        return historial;
    }

    /**
     * Asigna un historial al paciente.
     *
     * @param historial Historial a asignar.
     */
    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    /**
     * Devuelve el médico asignado al paciente.
     *
     * @return Médico asignado al paciente.
     */
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    /**
     * Asigna un médico al paciente.
     *
     * @param medicoAsignado Médico a asignar.
     */
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return representación de objeto {@code Paciente}
     */
    @Override
    public String toString() {
        return  "Objeto Paciente {\n" +
                " historial = '" + historial + "',\n" +
                " medicoAsignado = '" + medicoAsignado + "',\n" +
                " nombre = '" + nombre + "',\n" +
                " dni = '" + dni + "',\n" +
                " email = '" + email + "',\n" +
                " direccion = '" + direccion + "'\n" +
                '}';
    }
}
