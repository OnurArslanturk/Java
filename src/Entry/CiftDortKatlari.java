package Entry;
import  java.util.Scanner;
public class CiftDortKatlari {
    public static void main(String[] args) {
        int dort=0, cift=0, sayi =0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            sayi = inp.nextInt();
            if (sayi %2 == 0) cift+= sayi;
            if (sayi %4 == 0) dort+= sayi;
        }
        while (sayi%2==0);
        System.out.println("Çift sayılar toplamı : "+cift);
        System.out.println("Dörte tam bölünen sayılar toplamı : "+dort);
    }
}
