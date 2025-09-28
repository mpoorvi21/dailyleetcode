import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {

        System.out.println("Enter a Number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int product = 1;
        int temp = number;

        while (number!=0){
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        if(sum + product == temp){
            System.out.println(temp + " is a Special Number");
        } else {
            System.out.println(temp + " is not a Special Number");
        }
    }
}
