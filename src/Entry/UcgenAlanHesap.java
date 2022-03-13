package Entry;
import java.util.Scanner;
public class UcgenAlanHesap
{
    public static void main (String[] args) {

        Scanner deger = new Scanner(System.in);

        System.out.print("A kenar uzunlugunu giriniz : ");
        double akenar = deger.nextInt();
        System.out.print("B kenar uzunlugunu giriniz : ");
        double bkenar = deger.nextInt();
        System.out.print("C kenar uzunlugunu giriniz : ");
        double  ckenar = deger.nextInt();

        double cevre=(akenar+bkenar+ckenar);
        double form1=cevre/2;
        double form2=(form1)*(form1-akenar)*(form1-bkenar)*(form1-ckenar);
        double alan=Math.sqrt(form2);

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);
    }

}