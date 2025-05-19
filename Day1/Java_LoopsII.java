import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of queries

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            generateSeries(a, b, n);
        }
        scanner.close();
    }

    public static void generateSeries(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
