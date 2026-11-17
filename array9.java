import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear el array de 100 enteros y rellenarlo con valores entre 1 y 10
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (1 + Math.random() * 10);
        }

        // 2. Pedir al usuario el valor N
        System.out.print("Introduce un valor entero N (entre 1 y 10): ");
        int n = scanner.nextInt();

        // 3. Buscar y mostrar las posiciones en las que aparece N
        System.out.print("El valor " + n + " aparece en las posiciones: ");
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        // Si no apareció ninguna vez, avisar al usuario
        if (!encontrado) {
            System.out.print("Ninguna (el número no está en el array).");
        }

        System.out.println();
        scanner.close();
    }
}
