package Entry;
import java.util.Scanner;
public class FlyTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km ütünden giriniz : ");
        int km = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int oneWay = inp.nextInt();
        if (km>0) {
            if (age>0){
                if (oneWay == 1 || oneWay == 2) {
                    double bilet = km * 0.1;
                    if (age < 12) bilet *= 0.5;
                    else if ((age > 12 || age == 12) && (age < 24 || age == 24)) bilet *= 0.9;
                    else if (age > 65) bilet *= 0.7;
                    if (oneWay == 2) { bilet *= 0.8; bilet *=2; }
                    System.out.println("Toplam tutar = " +bilet+" TL");
                }
                else System.out.println("Hatalı bilet tipi");
            }
            else System.out.println("Hatalı yaş bilgisi");
        }
        else System.out.println("Hatalı KM bilgisi!");

    }
}
