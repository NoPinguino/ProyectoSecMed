package model.enums;

/**
 * Enum que representa los tipos de prueba disponibles.
 * <p>
 *     Cada constante dispone de un nombre con formato legible para imprimir por consola.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public enum TipoPrueba {
    ANALISIS_SANGRE("Análisis de sangre"),
    ANALISIS_ORINA("Análisis de orina"),
    RADIOGRAFIA("Radiografía"),
    RESONANCIA("Resonancia magnética"),
    ECOGRAFIA("Ecografía"),
    ELECTROCARDIOGRAMA("Electrocardiograma"),
    TEST_ALERGIAS("Test de alergias"),
    PRUEBA_ESFUERZO("Prueba de esfuerzo"),
    ENDOSCOPIA("Endoscopia");

    /**
     * Nombre legible del tipo de prueba médica.
     */
    private final String nombre;

    /**
     * Constructor del enum {@code TipoPrueba}
     *
     * @param nombre Nombre legible del tipo de prueba.
     */
    TipoPrueba(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre legible del tipo de prueba médica.
     *
     * @return Nombre legible del tipo de prueba.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el nombre legible del tipo de prueba.
     *
     * @return Nombre legible del tipo de prueba.
     */
    @Override
    public String toString() {
        return nombre;
    }
}
