import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int digit, number = scanner.nextInt();

        while (number!=0){
            digit = number % 10;
            System.out.print(digit);
            number = number /10;
        }
        scanner.close();
    }
}
