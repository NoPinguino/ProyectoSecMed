package model.entities;

public class Paciente extends Persona {
    private HistorialMedico historial;
    private Medico medicoAsignado;

    public Paciente(String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion);
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
        return "Paciente{" +
                "historial=" + historial +
                ", medicoAsignado=" + medicoAsignado +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
