import java.util.Scanner;
import java.util.Arrays;

public class array17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear dos arrays de 10 enteros cada uno
        int[] primeros = new int[10];
        int[] segundos = new int[10];

        System.out.println("Introduce 20 valores enteros:");

        // 2. Leer los 10 primeros valores y guardarlos en el primer array
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            primeros[i] = scanner.nextInt();
        }

        // 3. Leer los 10 últimos valores y guardarlos en el segundo array
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 11) + ": ");
            segundos[i] = scanner.nextInt();
        }

        // 4. Mostrar ambos arrays y compararlos con Arrays.equals()
        System.out.println("\nPrimer array:  " + Arrays.toString(primeros));
        System.out.println("Segundo array: " + Arrays.toString(segundos));

        if (Arrays.equals(primeros, segundos)) {
            System.out.println("Los dos arrays SON iguales.");
        } else {
            System.out.println("Los dos arrays NO son iguales.");
        }

        scanner.close();
    }
}
