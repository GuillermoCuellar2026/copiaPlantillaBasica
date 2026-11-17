import java.util.Scanner;
import java.util.Arrays;

public class array10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la cantidad N de personas
        System.out.print("Introduce el número de personas (N): ");
        int n = scanner.nextInt();

        // 2. Crear el array de tamaño N
        double[] alturas = new double[n];
        double suma = 0;

        // 3. Rellenar el array con las alturas introducidas por teclado
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Introduce la altura en metros de la persona " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            suma += alturas[i];
        }

        // 4. Calcular la media
        double media = suma / alturas.length;

        // 5. Ordenar el array para obtener mínima (posición 0) y máxima (última posición)
        Arrays.sort(alturas);
        double minima = alturas[0];
        double maxima = alturas[alturas.length - 1];

        // 6. Recorrer el array para contar cuántas están por encima y por debajo de la media
        int encimaMedia = 0;
        int debajoMedia = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                encimaMedia++;
            } else if (alturas[i] < media) {
                debajoMedia++;
            }
        }

        // 7. Mostrar resultados
        System.out.println("\nAlturas ordenadas: " + Arrays.toString(alturas));
        System.out.println("Altura media: " + media + " m");
        System.out.println("Altura máxima: " + maxima + " m");
        System.out.println("Altura mínima: " + minima + " m");
        System.out.println("Personas por encima de la media: " + encimaMedia);
        System.out.println("Personas por debajo de la media: " + debajoMedia);

        scanner.close();
    }
}

