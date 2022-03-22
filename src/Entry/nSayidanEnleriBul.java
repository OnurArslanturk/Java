package Entry;
import java.util.Scanner;
public class nSayidanEnleriBul {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");

        int i = inp.nextInt(), say=1, sayB=0, sayK=0,tampon=0;
        if (i >=2) {

            for (; i > 0; i--) {
                System.out.print(say + ". Sayıyı giriniz : ");
                tampon = inp.nextInt();
                if (say==1)
                {
                    sayB = tampon;
                    sayK = tampon;
                }
                if (tampon< sayK) sayK=tampon;
                else if(tampon> sayB) sayB = tampon;
                say++;
            }
            System.out.println("En büyük sayı : "+ sayB);
            System.out.print("En küçük sayı : "+ sayK);
        }
        else {
            System.out.println("En büyük en küçük ayrımı için en az 2 sayı giriyor olmalısınız.");
        }
    }
}
