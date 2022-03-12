package Entry;

import java.io.Console;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        //Değişkenleri oluşuruldu
        int mat, fzk, kmy, trk, tah, mzk;

        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //not bilgileri istendi ve ilgili değişkene atandı
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fzk = inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kmy = inp.nextInt();
        System.out.print("Türkçe Notunuz : ");
        trk = inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tah = inp.nextInt();
        System.out.print("Müzik Notunuz : ");
        mzk = inp.nextInt();

        //Not hesaplandı ve mantıksal işlemden geçirilerek mesaj ekrana yazdırıldı.
        double total = (( mat + fzk + kmy + trk + tah + mzk) / 6);
        System.out.print("Ortalamanız " + total+",");
        String gecis = total > 60 ? " Tebrikler, " +total+ " puan ile geçtiz." : " Maalesef, " +total+ " puan ile kaldınız.";
        System.out.print(gecis);

    }
}
