import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum =0;
        int temp =  number;

        while (number!=0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        if(temp % sum ==0){
            System.out.println(temp +" is a Niven Number");
        } else {
            System.out.println(temp +" is not a Niven Number");
        }
    }
}
