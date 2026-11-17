import java.util.Scanner;
import java.util.Arrays;

public class array13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar los valores V, I y N al usuario
        System.out.print("Introduce el valor inicial (V): ");
        int v = scanner.nextInt();

        System.out.print("Introduce el incremento (I): ");
        int inc = scanner.nextInt();

        System.out.print("Introduce el número de valores a crear (N): ");
        int n = scanner.nextInt();

        // Validar que N sea mayor que 0
        if (n <= 0) {
            System.out.println("El número de valores (N) debe ser mayor que 0.");
            scanner.close();
            return;
        }

        // 2. Crear el array de tamaño N y rellenarlo con la secuencia aritmética
        int[] secuencia = new int[n];

        for (int i = 0; i < secuencia.length; i++) {
            secuencia[i] = v + (i * inc);
        }

        // 3. Mostrar la secuencia almacenada en el array
        System.out.println("Secuencia aritmética: " + Arrays.toString(secuencia));

        scanner.close();
    }
}
