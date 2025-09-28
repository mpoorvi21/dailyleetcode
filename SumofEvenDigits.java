import java.util.Scanner;

public class SumofEvenDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number!=0){
            int digit = number%10;
            if(digit %2 ==0){
                sum = sum + digit;
            }
            number = number /10;
        }
        scanner.close();
    }
}
