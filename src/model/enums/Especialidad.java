package model.enums;

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

    private final String nombre;

    Especialidad(String nombre) {
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