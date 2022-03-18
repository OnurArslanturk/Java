package Entry;
import java.util.Scanner;
public class ChinaZodiac {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner (System.in);
        System.out.print("Doğduğunuz Yılı Giriniz : ");
        year = input.nextInt();
        if      (year < 0     ) System.out.println("Hatalı Giriş Yaptınız.");
        if      (year%12 == 0 ) System.out.println("Çin zodyağı burcunuz :  Maymun");
        else if (year%12 == 1 ) System.out.println("Çin zodyağı burcunuz :  Horoz");
        else if (year%12 == 2 ) System.out.println("Çin zodyağı burcunuz :  Köpek");
        else if (year%12 == 3 ) System.out.println("Çin zodyağı burcunuz :  Domuz");
        else if (year%12 == 4 ) System.out.println("Çin zodyağı burcunuz :  Fare");
        else if (year%12 == 5 ) System.out.println("Çin zodyağı burcunuz :  Öküz");
        else if (year%12 == 6 ) System.out.println("Çin zodyağı burcunuz :  Kaplan");
        else if (year%12 == 7 ) System.out.println("Çin zodyağı burcunuz :  Tavşan");
        else if (year%12 == 8 ) System.out.println("Çin zodyağı burcunuz :  Ejderha");
        else if (year%12 == 9 ) System.out.println("Çin zodyağı burcunuz :  Yılan");
        else if (year%12 == 10) System.out.println("Çin zodyağı burcunuz :  At");
        else if (year%12 == 11) System.out.println("Çin zodyağı burcunuz :  Koyun");
    }
}
