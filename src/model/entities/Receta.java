package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representación de historial médico de tipo {@code Receta}
 * <p>
 *     Hereda atributos y métodos de {@code EntradaHistorial} y añade una lista de medicamentos recetados.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public class Receta extends EntradaHistorial{
    /**
     * Lista de medicamentos recetados.
     */
    private List<String> medicamentos;

    /**
     * Construye un objeto {@code Receta}
     *
     * @param fecha Fecha del momento en el que se hizo la receta.
     * @param idMedico Identificador del médico que realizó la receta.
     * @param causa Motivo por el que se realizó la receta.
     * @param medicamentos Lista de medicamentos recetados.
     */
    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos != null ? medicamentos : new ArrayList<>();
    }

    /**
     * Devuelve la lista de los medicamentos recetados.
     *
     * @return Lista de medicamentos.
     */
    public List<String> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Devuelve el nombre simplificado de la clase.
     *
     * @return Nombre simplificado de la clase.
     */
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return Representación de objeto {@code Receta}
     */
    @Override
    public String toString() {
        return  "Objeto Receta {\n" +
                " medicamentos = '" + medicamentos + "'\n" +
                '}';
    }
}
