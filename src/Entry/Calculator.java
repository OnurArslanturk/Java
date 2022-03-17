package Entry;
import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı griniz : ");
        try {
            double s1 = inp.nextDouble();
            System.out.print("İkinci sayıyı giriniz : ");
            double s2 = inp.nextDouble();

            System.out.println("1-Toplama \n2-Çıkarma\n3.Çarpma\n4-Bölme");
            System.out.print("Seçiminiz : ");
            int select = inp.nextInt();

            switch (select) {

                case 1:
                    s1 += s2;
                    System.out.println(s1);
                    break;

                case 2:
                    s1 -= s2;
                    System.out.println(s1);
                    break;

                case 3:
                    s1 *= s2;
                    System.out.println(s1);
                    break;

                case 4:
                    if(s1!=0) {
                        s1 /= s2;
                        System.out.println(s1);
                    }
                    else System.out.println("Bir sayı 0'a bölünemez");
                    break;

                default:
                    System.out.println("İşlem numarası hatalıdır");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println("Hatalı işlem");
        }
    }
}


