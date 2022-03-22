package Entry;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        System.out.print("Number : ");
        number = scan.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number)
            System.out.println(number+" sayısı mükemmel sayıdır!");
        else System.out.println(number+" sayısı mükemmel sayı değildir!");


    }
}
