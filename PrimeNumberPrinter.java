import java.util.Scanner;

public class PrimeNumberPrinter {
    public static void main(String[] args) {

        System.out.println("Enter start number:");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        System.out.println("Enter end number:");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int count = 0;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}