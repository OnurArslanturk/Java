package Entry;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi=0, sum=0;
        System.out.print("Kaç sayı sorgulatacaksınız : ");
        int count = input.nextInt();
        while (count > 0)
        {
            System.out.print("Sayı giriniz : ");
            sayi = input.nextInt();
            if (sayi != 0)
            {


            for (int i = sayi;i>0;i--)
            {
                if (sayi%i==0) sum +=i;
            }
            if (sayi == (sum/2)) System.out.println(sum+"(tam bölenlerin toplamı)/2 = " + (sum/2) +" girdiğiniz "+sayi+" sayısına eşit olduğu için; " + sayi+" mükemmel bir sayidir.");
            else System.out.println(sum+"(tam bölenlerin toplamı)/2 = " + (sum/2) +" girdiğiniz "+sayi+" sayısına eşit olmadığı için; " + sayi+" mükemmel bir sayı değildir.");
            }
            else System.out.println("0 girdiniz");
            sum =0;
            count--;
        }
    }
}





//https://app.patika.dev/onurarslanturk
//www.patika.dev