package Entry;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        //Scanner inp1 = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz: ");
        double pi = 3.14, r=inp.nextInt(), a;
        System.out.print("Merkez açı derecesini giriniz: ");
        a = inp.nextInt();
        System.out.println("Daire Alanı: "+ pi*r*r);
        System.out.println("Daire Çevresi: "+ 2*pi*r);
        System.out.println("Daire Diliminin Alanı: "+ (pi*(r*r)*a)/360);
    }
}
