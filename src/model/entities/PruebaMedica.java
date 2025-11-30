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

    @Override
    public String toString() {
        return "PruebaMedica{" +
                "tipoPrueba=" + tipoPrueba +
                ", resultado='" + resultado + '\'' +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                '}';
    }
}
