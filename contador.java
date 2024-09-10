import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int mayor = -9, contador = 0, dato = 0, cantidad = 0, cantidad2 = 1;
        Scanner valor = new Scanner(System.in);

        while (cantidad <= 0) {
            System.out.println("Ingrese cantidad de números a ingresar: ");
            cantidad = valor.nextInt();

            if (cantidad <= 0) {
                System.out.println("Debe ingresar valores positivos mayores a 0... Reintente");
            }
        }

        while (contador < cantidad) {
            System.out.printf("Ingrese dato %d: \n", cantidad2);
            dato = valor.nextInt();

            if (dato > mayor) {
                mayor = dato;
            }

            contador++;
            cantidad2++;
        }

        System.out.println("El número mayor ingresado es: " + mayor);
    }
}
