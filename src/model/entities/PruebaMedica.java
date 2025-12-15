package model.entities;
import model.enums.TipoPrueba;

import java.time.LocalDate;

/**
 * Representación de una entrada de historial médico tipo {@code PruebaMedica}
 * <p>
 *     Hereda atributos y métodos de {@code EntradaHistorial} y añade información específica sobre el tipo de prueba
 *     y el resultado de la misma.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public class PruebaMedica extends EntradaHistorial {
    private TipoPrueba tipoPrueba;
    private String resultado;

    /**
     * Construye un objeto {@code PruebaMedica}
     *
     * @param fecha Fecha en la que se realizó la prueba.
     * @param idMedico Id del médico que realizó la prueba.
     * @param causa Motivo por el que se realizó la prueba.
     * @param tipoPrueba Tipo de prueba realizada.
     * @param resultado Resultado de la prueba realizada.
     */
    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }

    /**
     * Devuelve el tipo de prueba realizada.
     *
     * @return Tipo de prueba realizada.
     */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    /**
     * Devuelve el resultado de la prueba realizada.
     *
     * @return Resultado de la prueba realizada.
     */
    public String getResultado() {
        return resultado;
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
     * @return Representación de objeto {@code PruebaMedica}
     */
    @Override
    public String toString() {
        return  "Objeto PruebaMedica{" +
                " tipoPrueba = '" + tipoPrueba + "',\n" +
                " resultado = '" + resultado + "',\n" +
                " fecha = '" + fecha + "',\n" +
                " idMedico = '" + idMedico + "',\n" +
                " causa = '" + causa + "'\n" +
                '}';
    }
}
