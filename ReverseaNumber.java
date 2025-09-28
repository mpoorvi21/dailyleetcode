import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reverseNumber = 0;
        while (number!=0){
            int digit = number %10;
            reverseNumber = reverseNumber*10 + digit;
            number = number /10;
        }
        System.out.println("Reverse Number: " + reverseNumber);
        scanner.close();
    }
}
