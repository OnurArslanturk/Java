package Entry;
import java.util.Scanner;
public class SayiOrtalamasi {
    public static void main(String[] args) {
        int uceB=0, uceCount=0, dortB=0, dortCount=0;
        System.out.println("Bir tam sayı giriniz :");
        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();

        for (;sayi>0;sayi--){

            if (sayi%3==0){
                uceB+=sayi;
                uceCount++;
            }
            if (sayi%4==0){
                dortB+=sayi;
                dortCount++;
            }
        }
        System.out.println("Üçe bölnenler toplam :" + uceB);
        System.out.println("Üçe bölünenler sayı adeti :"+ uceCount);
        System.out.println("Dörte bölnenler toplam :" + dortB);
        System.out.println("Dörte bölünenler sayı adeti :"+ dortCount);
        System.out.println("Üçe tam olarak bölnen sayıların ortalaması :"+(uceB/uceCount));
        System.out.println("Dörte tam olarak bölnen sayıların ortalaması :"+(dortB/dortCount));
        System.out.println("Üçe ve dörte tam olarak bölnen sayıların ortalaması :"+((uceB+dortB)/(uceCount+dortCount)));
    }
}
