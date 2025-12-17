package model.entities;
import model.enums.EstadoAnalisis;
import model.enums.TipoAnalisis;
import model.enums.TipoPrueba;

import java.time.LocalDate;

public class Analisis extends EntradaHistorial {
    private TipoAnalisis tipoAnalisis;
    private EstadoAnalisis estado;

    public Analisis(LocalDate fecha, String idMedico, String causa, TipoAnalisis tipoAnalisis, EstadoAnalisis estado) {
        super(fecha, idMedico, causa);
        this.tipoAnalisis = tipoAnalisis;
        this.estado = estado;
    }

    public TipoAnalisis getTipoAnalisis() {
        return tipoAnalisis;
    }

    public void setTipoAnalisis(TipoAnalisis tipoAnalisis) {
        this.tipoAnalisis = tipoAnalisis;
    }

    public EstadoAnalisis getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnalisis estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el nombre simplificado de la clase.
     *
     * @return Nombre simplificado de la clase.
     */
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Objeto Analisis {\n" +
                "> tipoAnalisis = " + tipoAnalisis + "\n" +
                "> estado = " + estado + "\n" +
                "}\n";
    }
}
