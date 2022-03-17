package Entry;
import java.util.Scanner;
public class UsePass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String sifre = "java123";
        System.out.print("Kullanıcı Adınız : ");
        String userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        String password = inp.nextLine();

        if(userName.equals("patika") && password.equals(sifre)){

            System.out.println("Gririş Yaptınız.");
        } else {
            System.out.println("Bilgilerinizde hata var!");
            System.out.println("\n Şifre sıfırlamak ister misiniz? : 1-Evet / 2- Hayır");
            byte reset = inp.nextByte();
            if (reset==1){
                System.out.print("Yeni şifreniz:");
                inp.nextLine();
                password = inp.nextLine();
                if (password.equals(sifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }
                else {
                    sifre=password;
                    System.out.println("Şifre oluşturuldu");
                }
            }else{
                System.out.println("Şifre sıfırlama iptal edildi.");
            }
        }
    }
}
