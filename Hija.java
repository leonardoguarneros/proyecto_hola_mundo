public class Hija {
    public static void main(String[] args) {
        Padre padre1 = new Padre("Leonardo", "Guarneros Alvardo", 7);

        padre1.setNombre("Leonardo");
        padre1.setApellidos("Guarneros Alvardo");

        System.out.println("Datos del niño: " + padre1.toString());
    }
}
