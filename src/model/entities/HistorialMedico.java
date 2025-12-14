package model.entities;
import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<EntradaHistorial> entradas;

    public HistorialMedico() {
        this.entradas = new ArrayList<>();
    }
    /* Getter: -List<EntradaHistorial> entradas */
    public List<EntradaHistorial> getEntradas() {
        return entradas;
    }

    /**
     * Añadimos una entrada a la lista de entradas
     * @param entradaHistorial tipo EntradaHistorial
     */
    public void agregarEntrada(EntradaHistorial entradaHistorial) {
        entradas.add(entradaHistorial);
    }

    @Override
    public String toString() {
        return  "Objeto HistorialMedico {\n" +
                " entradas = '" + entradas + "'\n" +
                '}';
    }
}
