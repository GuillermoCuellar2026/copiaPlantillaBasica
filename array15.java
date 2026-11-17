import java.util.Arrays;

public class array15 {
    public static void main(String[] args) {
        // 1. Calcular el tamaño total del array (1 + 2 + 3 + ... + 10 = 55)
        int tamano = 0;
        for (int i = 1; i <= 10; i++) {
            tamano += i;
        }

        // 2. Crear el array con el tamaño calculado
        int[] secuencia = new int[tamano];

        // 3. Rellenar el array usando un índice independiente
        int posicion = 0;
        for (int numero = 1; numero <= 10; numero++) {
            for (int repeticion = 0; repeticion < numero; repeticion++) {
                secuencia[posicion] = numero;
                posicion++;
            }
        }

        // 4. Mostrar el contenido del array por pantalla
        System.out.println("Secuencia generada (" + secuencia.length + " elementos):");
        System.out.println(Arrays.toString(secuencia));
    }
}
