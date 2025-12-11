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
    /* Getter & Setter: -TipoPrueba tipoPrueba */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    public void setTipoPrueba(TipoPrueba tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }
    /* Getter & Setter: -String resultado */
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
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
