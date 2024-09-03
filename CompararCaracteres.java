package Lab6;
import java.util.Scanner;

public class CompararCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer carácter: ");
        char caracter1 = scanner.next().charAt(0);

        System.out.print("Introduce el segundo carácter: ");
        char caracter2 = scanner.next().charAt(0);

        if (caracter1 == caracter2) {
            System.out.println("Los caracteres son iguales.");
        } else {
            System.out.println("Los caracteres son diferentes.");
        }

        scanner.close();
    }
}
