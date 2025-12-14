package model.entities;

public class Paciente extends Persona {
    private HistorialMedico historial;
    private Medico medicoAsignado;

    public Paciente(String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion);
        this.historial = new HistorialMedico();
    }
    /* Setter & Getter: -HistorialMedico historial */
    public HistorialMedico getHistorial() {
        return historial;
    }
    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }
    /* Setter & Getter: -Medico medicoAsignado */
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

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
