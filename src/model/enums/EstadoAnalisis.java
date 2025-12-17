package model.enums;

public enum EstadoAnalisis {
    PENDIENTE("Análisis pendiente"),
    EN_PROCESO("Análisis en proceso"),
    COMPLETADO("Análisis completado");

    private final String nombre;

    EstadoAnalisis(String nombre) {
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
