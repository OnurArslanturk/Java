package Entry;
import java.util.Scanner;
public class DiamondWstars {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("kaç satırlık bir bir elmas olsun? :");
        int n = klavye.nextInt();

        System.out.print("kaç adet elmas olsun? :");
        int diamondQuant= klavye.nextInt();


        for (int i = 0; i <= (n-1) ; i++) { // satır döngüsü - Her döngü turunda bir satır atlıyor. {} içindeki en altta ..println(" "); komutu ile satır atlıyor.
            for (int a =1 ; a <= diamondQuant; a++) {
                for (int j = 0; j < ((n-1) - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                for (int j = 0; j < ((n-1) - i); j++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= (n-1) ; i++) { // n-1 çünkü en alttaki *** satırı en geniş ** bloğu ve bunu üstteki döngüde yaptık. Bunun tekrar etmemesi adına satır sayısı-1 olarak dönüyor
            for (int a =0 ; a < diamondQuant; a++) { // yan yana elmasların alt yani ters üçgenlerini yapan kısım.
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (((n*2)-1)-(i*2)); j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
