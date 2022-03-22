package Entry;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int i , ebob = 1, ekok=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        int n1 = inp.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = inp.nextInt();

        //en küçük sayıyı bulma
        if (n1>n2) i = n1;
        else i = n2;

        while (i > 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                ekok = (n1 * n2) / ebob;
                break;
            }
            i--;
        }
        System.out.println(" EBOB : " + ebob + " EKOK : " + ekok);
    }
}
