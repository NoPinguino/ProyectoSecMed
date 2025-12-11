package model.entities;
import model.enums.Especialidad;

public class Medico extends PersonalSanitario {
    private Especialidad especialidad;

    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numeroColegiado, Especialidad especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numeroColegiado);
        this.especialidad = especialidad;
    }
    /* Setter & Getter: -Especialidad especialidad */
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return  "Objeto Medico {\n" +
                " especialidad = '" + especialidad + "',\n" +
                " numeroColegiado = '" + numeroColegiado + "',\n" +
                " username = '" + username + "',\n" +
                " passwordHash = '" + passwordHash + "',\n"+
                " salt = '" + salt + "',\n" +
                " nombre = '" + nombre + "',\n" +
                " dni = '" + dni + "',\n" +
                " email = '" + email + "',\n" +
                " direccion = '" + direccion + "'\n" +
                '}';
    }
}
