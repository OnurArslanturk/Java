package Entry;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz: ");
        int k = input.nextInt();
        int total = n;
        for (int i = 0; i <= k; i++){
            total *=n;
            i++;
        }
        System.out.println(n + " üssü " + k + " = " + total);


    }
}
