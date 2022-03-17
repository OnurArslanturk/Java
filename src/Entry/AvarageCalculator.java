package Entry;
import java.util.Scanner;
public class AvarageCalculator {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya,muzik;
        Scanner input = new Scanner(System.in);
        int toplamNot = 0, sayac = 0;
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if (mat > 0 && mat <= 100){
            sayac++;
            toplamNot +=mat;

        }

        if (fizik > 0 && fizik <= 100){
            sayac++;
            toplamNot +=fizik;
        }

        if (turkce > 0 && turkce <= 100){
            sayac++;
            toplamNot +=turkce;
        }

        if (kimya > 0 && kimya <= 100){
            sayac++;
            toplamNot +=kimya;
        }

        if (muzik > 0 && muzik <= 100){
            sayac++;
            toplamNot +=muzik;
        }

        double ortalama = toplamNot / sayac;
        if (ortalama<=55) System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        else System.out.println("Tebrikler, sınıfı geçtiniz");
        System.out.println(ortalama);
    }
}
