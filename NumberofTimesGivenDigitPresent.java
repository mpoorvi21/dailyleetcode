import java.util.Scanner;

public class NumberofTimesGivenDigitPresent {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitToFind = scanner.nextInt();
        int digit;
        int count = 0;
        while (number!=0){
            digit = number %10;
            if(digit == digitToFind) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
        scanner.close();
    }
}
