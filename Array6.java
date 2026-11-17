import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array (N): ");
        int n = scanner.nextInt();

        System.out.print("Introduce el valor a rellenar (M): ");
        int m = scanner.nextInt();

        int[] numeros = new int[n];

        // Rellenar y mostrar usando bucles normales
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = m;
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
