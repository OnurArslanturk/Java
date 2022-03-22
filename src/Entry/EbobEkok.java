package Entry;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        int n1 = inp.nextInt();
        int i = n1, ebob = 1, ekok=1;
        System.out.print("n2 sayısını giriniz : ");
        int n2 = inp.nextInt();

        while (i > 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                ekok = (n1 * n2) / ebob;
                break;
            }
            i--;
        }
        System.out.println(" Ebob : " + ebob + " Ekok : " + ekok);
    }
}
