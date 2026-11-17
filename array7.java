import java.util.Scanner;
import java.util.Arrays;

public class array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir los valores P y Q
        System.out.print("Introduce el valor entero P: ");
        int p = scanner.nextInt();

        System.out.print("Introduce el valor entero Q: ");
        int q = scanner.nextInt();

        // 2. Calcular el tamaño del array
        int tamano = Math.abs(q - p) + 1;
        int[] numeros = new int[tamano];

        // 3. Rellenar el array según si es ascendente o descendente
        if (p <= q) {
            for (int i = 0; i < tamano; i++) {
                numeros[i] = p + i;
            }
        } else {
            for (int i = 0; i < tamano; i++) {
                numeros[i] = p - i;
            }
        }

        // 4. Mostrar el contenido del array por pantalla
        System.out.println("Array resultante: " + Arrays.toString(numeros));

        scanner.close();
    }
}
