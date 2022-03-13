package Entry;
import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main (String[] args)
    {
        Scanner kmIn = new Scanner(System.in);
        System.out.print("Toplam KM'yi giriniz: ");
        double km = kmIn.nextInt();
        km = (20<(km*2.20)) ? (km * 2.20) + 10 : 30;
        System.out.println("Taksimetre ücreti : "+ km+"TL");


    }

}
