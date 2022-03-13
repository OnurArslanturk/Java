package Entry;

import java.util.Locale;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kg = inp.nextDouble();
        System.out.print("Vücut Kitle İndeksiniz : "+kg/(boy*boy));
    }
}
