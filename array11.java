import java.util.Arrays;

public class array11 {
    public static void main(String[] args) {
        // 1. Crear dos arrays de enteros de tamaño 100
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        // 2. Rellenar el primer array con los valores del 1 al 100
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        // 3. Copiar los valores del primer array al segundo en orden inverso
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }

        // 4. Mostrar ambos arrays por pantalla
        System.out.println("Primer array (1 al 100):");
        System.out.println(Arrays.toString(array1));

        System.out.println("\nSegundo array (100 al 1):");
        System.out.println(Arrays.toString(array2));
    }
}
