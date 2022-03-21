package Entry;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        boolean askn = false;
        double sum = 0;

        do {
            System.out.println("Please enter the number n: ");
            n = input.nextInt();
            if (n >= 0) {
                askn = true;
            }
        }
        while (!askn);

        for (double i = 1; i <= n; i++) {
            sum += (1 / i);
        }

        System.out.println(sum);

    }
}
