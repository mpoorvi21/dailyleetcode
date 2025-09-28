import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPalindrome = false;
        int temp = number;

        int reverseNumber = 0;
        while (number!=0){
            int digit = number %10;
            reverseNumber = reverseNumber*10 + digit;
            number = number /10;
        }
        if(reverseNumber == temp){
            isPalindrome = true;
            System.out.println("Palindrome Number");
        } else {
            isPalindrome = false;
            System.out.println("Not a Palindrome Number");
        }
        scanner.close();
    }
}
