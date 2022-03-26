package Entry;
import java.util.Scanner;
public class RecursivePrimeNumber {

    public static void PrimeNumberCheck (int number, int count)
    {
        if (number == count) {
            System.out.println(number + " prime number.");
            return;
        }
        else if (number % count == 0 || number <= 1) {
            System.out.println(number + " not prime number.");
            return;
        }
        PrimeNumberCheck(number, count+1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number for prime number check : ");
            PrimeNumberCheck(inp.nextInt(),2);
        }
    }
}
