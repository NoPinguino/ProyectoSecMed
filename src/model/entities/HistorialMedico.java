package model.entities;
import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<EntradaHistorial> entradas;

    public HistorialMedico(List<EntradaHistorial> entradas) {
        this.entradas = new ArrayList<>();
    }
    /* Getter: -List<EntradaHistorial> entradas */
    public List<EntradaHistorial> getEntradas() {
        return entradas;
    }

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "entradas=" + entradas +
                '}';
    }
}
