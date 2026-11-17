import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear el array de 100 números reales y rellenarlo
        double[] numeros = new double[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // 2. Pedir el valor real R al usuario
        System.out.print("Introduce un valor real R (entre 0,0 y 1,0): ");
        double r = scanner.nextDouble();

        // 3. Contar cuántos valores son iguales o superiores a R
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= r) {
                contador++;
            }
        }

        // 4. Mostrar el resultado por pantalla
        System.out.println("Hay " + contador + " valores iguales o superiores a " + r + ".");

        scanner.close();
    }
}
