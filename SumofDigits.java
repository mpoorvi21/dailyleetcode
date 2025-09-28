import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;
        while (number!=0){
            int digit = number %10;
            sum = sum + digit;
            number = number /10;
        }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
