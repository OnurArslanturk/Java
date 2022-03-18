package Entry;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("A Sayısını giriniz : ");
        a=inp.nextInt();
        System.out.print("B Sayısını giriniz : ");
        b=inp.nextInt();
        System.out.print("C Sayısını giriniz : ");
        c=inp.nextInt();

        if (a>b && a>c) {
            if (b > c) System.out.println("a > b > c");
            else if(c>b)System.out.println("a > c > b");
            else if(b==c) System.out.println("a > b = c");
        }
        else if (b>a && b>c){
            if (c>a) System.out.println("b > c > a");
            else if(a>c) System.out.println("b > a > c");
            else if (a==c) System.out.println("b > a = c");
        }
        else if (c>b && c>a){
            if (b>a) System.out.println("c > b > a");
            else if(a>b) System.out.println("c > a > b");
            else if (a==b) System.out.println("c > a = b");
        }

        else if (a==b && b==c)System.out.println("a = b = c");
    }
}
