package model.enums;

public enum EspecialidadEnfermeria {
    URGENCIAS("Medicina Familiar"),
    PEDIATRICO("Pediatrico"),
    GERIATRICO("Geriatrico"),
    GENERALISTA("Generalista");

    private final String nombre;

    EspecialidadEnfermeria(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre legible de la especialidad.
     *
     * @return Nombre legible de la especialidad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve una representación en formato texto del enum.
     *
     * @return Nombre legible de la especialidad.
     */
    @Override
    public String toString() {
        return nombre;
    }
}
