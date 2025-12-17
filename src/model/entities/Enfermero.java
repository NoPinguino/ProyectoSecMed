package model.entities;

import model.enums.EspecialidadEnfermeria;

public class Enfermero extends PersonalSanitario {
    private EspecialidadEnfermeria especialidadEnfermeria;

    public Enfermero(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, EspecialidadEnfermeria especialidadEnfermeria) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidadEnfermeria = especialidadEnfermeria;
    }

    public EspecialidadEnfermeria getEspecialidadEnfermeria() {
        return especialidadEnfermeria;
    }

    public void setEspecialidadEnfermeria(EspecialidadEnfermeria especialidadEnfermeria) {
        this.especialidadEnfermeria = especialidadEnfermeria;
    }

    @Override
    public String toString() {
        return "Objeto Enfermero {\n" +
                "> especialidadEnfermeria = " + especialidadEnfermeria + "\n" +
                "> numeroColegiado = " + numeroColegiado + "\n" +
                "> username = " + username + "\n" +
                "> passwordHash = " + passwordHash + "\n" +
                "> salt = " + salt + "\n" +
                "> nombre = " + nombre + "\n" +
                "> dni = " + dni + "\n" +
                "> email = " + email + "\n" +
                "> direccion = " + direccion + "\n" +
                '}';
    }
}
