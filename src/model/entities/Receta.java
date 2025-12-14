package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Receta extends EntradaHistorial{
    private List<String> medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, List<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos != null ? medicamentos : new ArrayList<>();
    }
    /* Getter: -List<String> numeroColegiado */
    public List<String> getMedicamentos() {
        return medicamentos;
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
        return  "Objeto Receta {\n" +
                " medicamentos = '" + medicamentos + "'\n" +
                '}';
    }
}
