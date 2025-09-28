import java.util.Scanner;

public class SumofPrimeDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number!=0){
            int digit = number % 10;
            if(digit ==2 || digit ==3 || digit ==5 || digit ==7){
                sum = sum + digit;
            }
            number = number /10;
        }
        System.out.print("Sum of prime digits: " + sum);
        scanner.close();
    }
}
