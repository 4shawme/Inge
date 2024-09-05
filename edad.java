import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        
        // Leer la edad del usuario
        int edad = scanner.nextInt();
        
        // Categorizar la edad y mostrar el mensaje correspondiente
        if (edad <= 0) {
            System.out.println("No nacido.");
        } else if (edad <= 12) {
            System.out.println("Usted es un niño.");
        } else if (edad <= 30) {
            System.out.println("Usted es un joven.");
        } else if (edad <= 60) {
            System.out.println("Usted es un adulto.");
        } else {
            System.out.println("Usted es de la tercera edad.");
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
}
