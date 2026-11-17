import java.util.Arrays;

public class array16 {
    public static void main(String[] args) {
        // 1. Calcular el tamaño total del array (1 + 2 + 3 + ... + 10 = 55)
        int tamano = 0;
        for (int i = 1; i <= 10; i++) {
            tamano += i;
        }

        // 2. Crear el array con el tamaño exacto
        int[] secuencia = new int[tamano];

        // 3. Rellenar cada tramo usando Arrays.fill(array, inicio, fin, valor)
        int inicio = 0;
        for (int numero = 1; numero <= 10; numero++) {
            int fin = inicio + numero;
            Arrays.fill(secuencia, inicio, fin, numero);
            inicio = fin;
        }

        // 4. Mostrar el contenido del array por pantalla
        System.out.println("Secuencia generada con Arrays.fill():");
        System.out.println(Arrays.toString(secuencia));
    }
}
