package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private List<String> medicamentos;

    public Receta(List<String> medicamentos) {
        this.medicamentos = new ArrayList<>();
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
