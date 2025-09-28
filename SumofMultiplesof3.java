import java.util.Scanner;

public class SumofMultiplesof3 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number!=0){
            int digit = number % 10;
            if(digit % 3 ==0){
                sum = sum + digit;
            }
            number = number/10;
        }
        System.out.println("Sum of multiples of 3: " + sum);
        scanner.close();
    }
}
