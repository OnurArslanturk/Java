package Entry;
import java.io.Console;
import java.util.Scanner;
public class KdvTutar {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutarı giriniz : ");
        double tutar = inp.nextInt(), kdvli = ((tutar >= 0) && (tutar <= 1000)) ? tutar * 1.18 : tutar * 1.08;
        System.out.println(kdvli);
    }
}
