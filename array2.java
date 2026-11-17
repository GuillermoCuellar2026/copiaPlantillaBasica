import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce 10 números reales:");
            numeros[i] = teclado.nextDouble();
            suma += numeros[i];
        }

        System.out.println("La suma de todos los valores es: " + suma);
        teclado.close();
    }
}
