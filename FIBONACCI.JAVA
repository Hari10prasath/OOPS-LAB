package fibonacci;
import java.util.Scanner;
public class FibonacciRecursion {
    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hari Prasath E"); 
        System.out.println("2117240070100");

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
