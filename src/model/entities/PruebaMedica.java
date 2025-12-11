package model.entities;
import model.enums.TipoPrueba;

import java.time.LocalDate;

public class PruebaMedica extends EntradaHistorial {
    private TipoPrueba tipoPrueba;
    private String resultado;

    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
    }
    /* Getter: -TipoPrueba tipoPrueba */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    /* Getter: -String resultado */
    public String getResultado() {
        return resultado;
    }
    /**
     * Devuelve el nombre de la clase.
     * @return String con el nombre de la clase
     */
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

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
