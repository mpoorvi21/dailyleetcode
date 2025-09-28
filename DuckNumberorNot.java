import java.util.Scanner;

public class DuckNumberorNot {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int digit, number = scanner.nextInt();
        boolean isDuck = false;
        while (number!=0){
            digit = number % 10;
            if (digit ==0){
                isDuck = true;
                break;
            }
            number = number /10;
        }
        if(isDuck ==true){
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
        scanner.close();
    }
}
