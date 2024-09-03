import java.util.Scanner;

public class MostrarNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leer dos números enteros por teclado
        System.out.print("Ingrese el primer número: ");
        int numero1 = in.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = in.nextInt();

        // Mostrar los números ingresados por pantalla
        System.out.println("El primer número ingresado es: " + numero1);
        System.out.println("El segundo número ingresado es: " + numero2);

        // Cerrar el escáner
        in.close();
    }
}
