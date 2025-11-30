package model.entities;
import java.time.LocalDate;

public abstract class EntradaHistorial {
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;

    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }
    /* Getter: #LocalDate fecha */
    public LocalDate getFecha() {
        return fecha;
    }
    /* Getter: #String idMedico */
    public String getIdMedico() {
        return idMedico;
    }
    /* Getter: #String causa */
    public String getCausa() {
        return causa;
    }
}
