import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        // Creamos un array de 10 elementos para números reales (double)
        double[] numeros = new double[10];

        // Bucle para pedir los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        // Bucle para mostrar los valores guardados
        System.out.println("\nLos números introducidos son:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}
