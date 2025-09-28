import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] binaryNumber = new int[10];
        int index = 0;

        while (number!=0){
            binaryNumber[index]= number % 2;
            number = number/2;
            index++;
        }

        for(int j = index-1;j>=0;j--){
            System.out.print(binaryNumber[j]);
        }
    }
}
