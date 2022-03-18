package Entry;
import java.util.Scanner;
public class AktiviteOnerisi {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = inp.nextInt();

        if(heat<5) System.out.print("Kayak zamanı!");
        else if (heat>=5 && heat<=15) System.out.print("Sinemaya gitmenin tam zamanı");
        else if (heat>15 && heat<=25) System.out.print("Piknik sepeti hazırlansın!");
        else  if (heat>25) System.out.print("Haydi yüzelim güneşlenelim");
        //  www.patika.dev
    }
}
