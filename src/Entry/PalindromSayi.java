package Entry;
import java.util.Scanner;
public class PalindromSayi {

    static boolean palindrom(int n) {
        int temp = n, reverseN = 0, lastN;
        while( temp != 0){
            lastN = temp % 10;
            reverseN = (reverseN *10) + lastN;
            temp /= 10;
         }
        if (n == reverseN) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı girin : ");
        int n = in.nextInt();
        if (palindrom(n)) System.out.println(n + " Sayısı polindrom sayıdır.");
        else System.out.println( n + " Sayısı polindrom sayı değildir.");
    }
}




// www.patika.dev
// https://app.patika.dev/onurarslanturk