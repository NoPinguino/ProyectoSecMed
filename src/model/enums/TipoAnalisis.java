package model.enums;

public enum TipoAnalisis {
    SANGRE("Análisis de sangre"),
    ORINA("Análisis de orina"),
    GLUCOSA("Análisis de glucosa"),
    ALERGIA("Análisis de alergias");

    private final String nombre;

    TipoAnalisis(String nombre) {
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
