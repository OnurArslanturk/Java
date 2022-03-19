package Entry;
import java.util.Scanner;
public class KuvvetAlma {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kuvvetler kaça kadar yazılsın (bir sayı girin) : ");
        n = inp.nextInt();
        System.out.println("Dörtün kuvvetleri");
        for (int i = 1; i <= n; i*=4){
            System.out.println(i);
        }
        System.out.println("Beşin kuvetleri");
        for (int i=1; i <= n;i*=5){
            System.out.println(i);
        }
    }
}
//  www.patika.dev