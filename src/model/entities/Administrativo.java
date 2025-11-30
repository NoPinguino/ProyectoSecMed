package model.entities;

public class Administrativo extends Usuario {
    private String idAdministrativo;

    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.idAdministrativo = idAdministrativo;
    }
    /* Setter & Getter: -String idAdministrativo */
    public String getIdAdministrativo() {
        return idAdministrativo;
    }
    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
