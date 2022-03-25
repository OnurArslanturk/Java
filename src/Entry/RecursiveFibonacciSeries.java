package Entry;
import java.util.Scanner;
public class RecursiveFibonacciSeries {

    static int fib(int n){
        if (n == 1 || n ==2) return 1;
        return fib(n-1) + fib (n-2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Series : ");
        int nInp = inp.nextInt();
        System.out.println(fib(nInp));

    }
}
