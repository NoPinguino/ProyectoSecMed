package model.enums;

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

    private final String nombre;

    TipoPrueba(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
