import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        int suma, multiplicacion, promedio, N1, N2, N3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        String numero1 = scanner.nextLine();
        N1 = Integer.parseInt(numero1);

        System.out.println("Ingrese el segundo número:");
        String numero2 = scanner.nextLine();
        N2 = Integer.parseInt(numero2);

        System.out.println("Ingrese el tercer número:");
        String numero3 = scanner.nextLine();
        N3 = Integer.parseInt(numero3);

        suma = N1 + N2 + N3;
        multiplicacion = N1 * N2 * N3;
        promedio = suma / 3;

        // Imprimir resultados de suma, multiplicación y promedio
        System.out.println("La suma de los 3 números es: " + suma);
        System.out.println("La multiplicación de los 3 números es: " + multiplicacion);
        System.out.println("El promedio de los 3 números es: " + promedio);

        // Determinar el número mayor y menor
        if (N1 > N2 && N1 > N3) {
            System.out.println("El número mayor es: " + N1);
            if (N2 > N3) {
                System.out.println("El número menor es: " + N3);
            } else {
                System.out.println("El número menor es: " + N2);
            }
        } else if (N2 > N1 && N2 > N3) {
            System.out.println("El número mayor es: " + N2);
            if (N1 > N3) {
                System.out.println("El número menor es: " + N3);
            } else {
                System.out.println("El número menor es: " + N1);
            }
        } else if (N3 > N1 && N3 > N2) {
            System.out.println("El número mayor es: " + N3);
            if (N1 > N2) {
                System.out.println("El número menor es: " + N2);
            } else {
                System.out.println("El número menor es: " + N1);
            }
        } else {
            System.out.println("No se sabe cuál es el mayor ni el menor.");
        }
    }
}
