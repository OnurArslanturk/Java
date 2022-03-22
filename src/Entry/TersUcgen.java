package Entry;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("kaç satırlık bir bir elmas olsun? :");
        int n = klavye.nextInt();

        System.out.print("kaç adet elmas olsun? :");
        int diamondQuant= klavye.nextInt();

        for (int i = 0; i <= (n) ; i++) {
            for (int a =0 ; a < diamondQuant; a++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (((n*2)-1)-(i*2)); j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}


//https://app.patika.dev/onurarslanturk
//www.patika.dev