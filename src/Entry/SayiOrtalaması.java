package Entry;
import java.util.Scanner;
public class SayiOrtalaması {
    public static void main(String[] args) {
        int uceB=0, uceCount=0, dortB=0, dortCount=0;

        Scanner inp = new Scanner(System.in);
        int sayi = inp.nextInt();

        for (;sayi>=0;sayi--){

            if (sayi%3==0){
                uceB+=sayi;
                uceCount++;
            }
            else if (sayi%4==0){
                dortB+=sayi;
                dortCount++;
            }
        }
        System.out.println("Üçe tam olarak bölnen sayıların ortalaması :"+(uceB/uceCount));
        System.out.println("Dörte tam olarak bölnen sayıların ortalaması :"+(dortB/dortCount));
        System.out.println("Üçe ve dörte tam olarak bölnen sayıların ortalaması :"+((uceB+dortB)/(uceCount+dortCount)));
    }
}
