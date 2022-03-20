package Entry;
import java.util.Scanner;
public class UsHesaplama {
    public static void main(String[] args) {
        int sayi,us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban olacak sayı : ");
        sayi = input.nextInt();
        int sonuc =sayi;
        System.out.print("Üs olacak sayı : ");
        us = input.nextInt();
        if (us!=0)
        {
            for(int i=1;i<us;i++){
                sonuc*=sayi;
            }
            System.out.println(sayi+ " üssü "+ us +" = "+sonuc);
        }
        else System.out.println(sayi+ " üssü "+ us +" = "+1);
    }
}
// www.patika.dev