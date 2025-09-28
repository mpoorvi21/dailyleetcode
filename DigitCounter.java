import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while (number!=0){
            count++;
            number = number /10;
        }
        System.out.println(count);
        scanner.close();
    }
}
