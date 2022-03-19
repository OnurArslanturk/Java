package Entry;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        long sayi=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktoriel alma işlemi için bir sayi giriniz : ");
        sayi = inp.nextLong();
        for (long i=(sayi-1);i!=0; i--){
            sayi*=i;
        }
        System.out.println(sayi);
    }
}
