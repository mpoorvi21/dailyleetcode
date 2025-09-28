import java.util.Scanner;

public class CreditScoreChecker {
    public static void main(String[] args) {
        System.out.println("Enter your credit score:");
        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();
        if (creditScore < 400 || creditScore > 850) {
            System.out.println("Invalid credit score" + creditScore);
        } else if (creditScore < 600 && creditScore >= 400) {
            System.out.println("Silver Card Eligible");
        } else if (creditScore < 800 && creditScore >= 600) {
            System.out.println("Gold Card Eligible");
        } else  {
            System.out.println("Platinum Card Eligible");
        }
        scanner.close();
    }
}
