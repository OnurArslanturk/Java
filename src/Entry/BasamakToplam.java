package Entry;
import java.util.Scanner;
public class BasamakToplam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // 1.klasik Scanner sınıfı import ve değişken tanımlamasını yaptık ve kullanıcıdan sayı isteyerek bunu int tipi a değişkenine atadık.
        System.out.print("Basamakları toplanacak bir sayı giriniz : ");
        int a = inp.nextInt(),counter=0;

        // 2.sayi değişkeni 2. döngümüzde(do-while) tek tek cımbızlayarak aldığımız basamakları += operatörü ile topladığımız(sum) değişkenimiz.
        int sayi = 0;

        // 3.kullanıcının girdiği sayıyı a değişkenine aldık ancak aşağıda a değişkenini 10 böle böle ham datayı bozduğumuz
        // için bunu bir sonraki do-while döngüsü için başka değişkende yani b değişkeninde saklıyoruz.
        int b = a;

        // 4.Basamak saydırma kısmı. Ayrıca counter burada ++ ile artarken diğer işlemde de -- azaltarak yine sayaç olacak kullanılacak.
        // NOT: sıfır rakamı girilir ise tüm göstergeler sıfır gösterecektir.
        // Bu istisna if koşul ifadesi ile ayıklanabilir ancak sadece kalması ve başkalarına yardımcı olabilmesi adına karıştırmıyorum.
        while (a != 0)
        {
         a/=10;
         counter++;
        }
        System.out.println(counter+ " basamaklı bir sayı girdiniz.");

        // 5.ben burada do-while tercih ettim ancak for döngüsü de gayet iyi gider.
            do
            {
                // 6.bu ekrana yazrıdma kodu ise her basamağı ayrı ayrı yazıdırıyor.
                System.out.println(b % 10);
                sayi +=(b % 10);
                b /= 10;
                counter--;
            }
            while (counter > 0);
        System.out.println("basamakların toplamı : " + sayi);
    }
}
// www.patika.dev