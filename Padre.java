public class Padre {
    private String nombre;
    private String apellidos;
    private int años;

    // Constructor ajustado para recibir 3 parámetros como se usa en Hija.java
    public Padre(String nombre, String apellidos, int años) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.años = años;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setAnios(int años) {
        this.años = años;
    }

    public int getAnios() {
        return this.años;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Apellidos: " + this.apellidos + ", Años: " + this.años;
    }
}
