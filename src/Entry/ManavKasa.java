package Entry;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        double armut = 2.14 * inp.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        double elma = 3.67 * inp.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        double domates = 1.11 * inp.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        double muz = 0.95 * inp.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        double patlican = 5.0 * inp.nextDouble();

        System.out.print("Toplam tutar : "+(armut+elma+domates+muz+patlican)+"TL");

    }
}

