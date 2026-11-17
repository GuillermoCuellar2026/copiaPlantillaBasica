import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPos = 0;
        int sumaNeg = 0;

        System.out.println("Introduce 20 números enteros:");

        for (int i = 0; i < 20; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Entrada no válida. Introduce un número entero:");
                sc.next();
            }
            
            int num = sc.nextInt();
            
            if (num > 0) {
                sumaPos += num;
            } else if (num < 0) {
                sumaNeg += num;
            }
        }

        System.out.println("Suma de positivos: " + sumaPos);
        System.out.println("Suma de negativos: " + sumaNeg);
        sc.close();
    }
}
