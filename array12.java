import java.util.Scanner;
import java.util.Arrays;

public class array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el array de 10 enteros
        int[] array = new int[10];
        char opcion;

        // Repetir el menú indefinidamente hasta que el usuario elija 'c'
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    // Mostrar todos los valores por pantalla
                    System.out.println("Valores del array: " + Arrays.toString(array));
                    break;

                case 'b':
                    // Pedir valor V y posición P
                    System.out.print("Introduce un valor entero V: ");
                    int v = scanner.nextInt();

                    System.out.print("Introduce la posición P (de 0 a 9): ");
                    int p = scanner.nextInt();

                    // Comprobar que la posición sea válida y escribir V en P
                    if (p >= 0 && p < array.length) {
                        array[p] = v;
                        System.out.println("Valor " + v + " guardado en la posición " + p + ".");
                    } else {
                        System.out.println("Posición no válida. Debe estar entre 0 y 9.");
                    }
                    break;

                case 'c':
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta. Elige a, b o c.");
                    break;
            }

        } while (opcion != 'c');

        scanner.close();
    }
}
