import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Declaramos el array de tipo double para aceptar números reales
        double[] numeros = new double[20];
        double suma = 0;

        System.out.println("Introduce 20 números reales:");

        // 2. Primer bucle: pedimos los números y los guardamos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        // 3. Segundo bucle: recorremos el array para sumar sus valores
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // 4. Calculamos y mostramos la media
        double media = suma / numeros.length;
        System.out.println("\nLa suma total es: " + suma);
        System.out.println("La media de los 20 números es: " + media);

        teclado.close();
    }
}
