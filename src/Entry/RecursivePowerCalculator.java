package Entry;
import java.util.Scanner;
public class RecursivePowerCalculator {

    static int powerCal(int base, int exponent){
        if (exponent == 0) return 1;
        return powerCal(base, exponent-1)*base;
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent = inp.nextInt();
        System.out.print("Sonuç : " + powerCal(base,exponent));

    }
}


//https://app.patika.dev/onurarslanturk
//www.patika.dev