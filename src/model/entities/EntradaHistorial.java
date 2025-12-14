package model.entities;
import java.time.LocalDate;

/**
 * Representa una entrada en el historial médico de un paciente.
 * <p>
 *     Clase abstracta que sirve como base para los distintos tipos de entradas en el historial, como lo son
 *     prueba médica o receta.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public abstract class EntradaHistorial {
    /**
     * Fecha en la que se ha realizado la entrada.
     */
    protected LocalDate fecha;
    /**
     * Identificador del médico que ha realizado la entrada.
     */
    protected String idMedico;
    /**
     * Motivo de la entrada.
     */
    protected String causa;

    /**
     * Construye un objeto {@code EntradaHistorial}
     *
     * @param fecha Fecha en la que se realizó la entrada.
     * @param idMedico Identificador del médico responsable.
     * @param causa Motivo de la entrada.
     */
    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }

    /**
     * Devuelve la fecha en la que se realizó la entrada
     * @return fecha en la que se realizó la entrada
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Devuelve el identificador del médico que realizó la entrada.
     * @return identificador del médico que realizó la entrada.
     */
    public String getIdMedico() {
        return idMedico;
    }

    /**
     * Devuelve el motivo de la entrada.
     *
     * @return texto que explica el motivo de la entrada.
     */
    public String getCausa() {
        return causa;
    }

    /**
     * Devuelve el tipo de la entrada según el nombre de la clase.
     *
     * @return nombre simplificado de la clase.
     */
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
