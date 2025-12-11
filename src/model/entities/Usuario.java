package model.entities;

public class Usuario extends Persona {
    protected String username;
    protected String passwordHash;
    protected String salt;

    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt) {
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }
    /* Setter & Getter: #String username */
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    /* Setter & Getter: #String password */
    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    /* Setter & Getter: #String salt */
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return  "Objeto Usuario {\n" +
                " username = '" + username + "',\n" +
                " passwordHash = '" + passwordHash + "',\n" +
                " salt = '" + salt + "',\n" +
                " nombre = '" + nombre + "',\n" +
                " dni = '" + dni + "',\n" +
                " email = '" + email + "',\n" +
                " direccion = '" + direccion + "'\n" +
                '}';
    }
}
