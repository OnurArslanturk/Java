package Entry;
import java.util.Scanner;
public class HarmoikSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("harmonik serisi bulunacak sayıyı giriniz : ");
        int n = inp.nextInt();
        double harmonic = 0;
        for (int i =1; i <= n; i++)
        {
            harmonic += (1.0/i);
        }
        System.out.println(harmonic);
    }
}
