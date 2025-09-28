import java.util.Scanner;

public class RecursionFibonacci {
    private static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {

        System.out.print("Fibonacci Series:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=0; i< number; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}

