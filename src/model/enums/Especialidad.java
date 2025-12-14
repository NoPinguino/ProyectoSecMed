package model.enums;

/**
 * Enum que representa las especialidades médicas disponibles.
 * <p>
 *     Cada una de las 20 constantes creadas dispone de un nombre con formato legible para imprimir por consola.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public enum Especialidad {
    MEDICINA_FAMILIAR("Medicina Familiar"),
    PEDIATRIA("Pediatría"),
    CARDIOLOGIA("Cardiología"),
    NEUROLOGIA("Neurología"),
    DERMATOLOGIA("Dermatología"),
    PSIQUIATRIA("Psiquiatría"),
    GINECOLOGIA("Ginecología"),
    TRAUMATOLOGIA("Traumatología"),
    OFTALMOLOGIA("Oftalmología"),
    OTORRINOLARINGOLOGIA("Otorrinolaringología"),
    ENDOCRINOLOGIA("Endocrinología"),
    NEFROLOGIA("Nefrología"),
    NEUMOLOGIA("Neumología"),
    ONCOLOGIA("Oncología"),
    REUMATOLOGIA("Reumatología"),
    GASTROENTEROLOGIA("Gastroenterología"),
    UROLOGIA("Urología"),
    CIRUGIA_GENERAL("Cirugía General"),
    ANESTESIOLOGIA("Anestesiología"),
    RADIOLOGIA("Radiología");

    /**
     * Nombre legible de la especialidad.
     */
    private final String nombre;

    /**
     * Constructor del enum {@code Especialidad}
     *
     * @param nombre Nombre legible
     */
    Especialidad(String nombre) {
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