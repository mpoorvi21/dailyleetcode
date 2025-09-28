import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
      try( Scanner scanner = new Scanner(System.in);){
          int number = scanner.nextInt();
          if (number < 0) {
              throw new IllegalArgumentException("Invalid Number" + number);
          } else if (number % 2 == 0) {
              System.out.println(number + " is even number");
          } else {
              System.out.println(number + " is odd number");
          }
      }
    }
}
