import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] n = new double[10];
        double max = n[0] = s.nextDouble(), min = n[0];

        for (int i = 1; i < 10; i++) {
            n[i] = s.nextDouble();
            if (n[i] > max) max = n[i];
            if (n[i] < min) min = n[i];
        }
        System.out.println("Máx: " + max + " | Mín: " + min);
    }
}

