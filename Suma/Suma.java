import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        int primero, segundo;
        double suma;
        char respuesta;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        do{
        System.out.println("Bienvenido a la suma de dos dijitos, por favor iingrese los siguientes digitos :)");
        System.out.println("");
        System.out.println("Ingrese el primer diijito: ");
        primero = scanner.nextInt();
        System.out.println("Ingrrse el segundo número: ");
        segundo =scanner.nextInt();

        resultado = primero + segundo;
        System.out.println("El resultado es: " + resultado);
        System.out.println("¿Deseas ingresar datos de otro candidato? (s/n)");
        respuesta= scanner.next().charAt(0);
        } while (respuesta != 'n' && respuesta != 'N');
System.out.println("Adios :)");
    //Cerrar escaner
    scanner.close();
    }
}

