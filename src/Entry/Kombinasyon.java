package Entry;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r) kombinasyonu hesaplama");
        System.out.print("n eleman sayısını girin: ");
        int n= inp.nextInt();
        System.out.print("r seçim sayısını girin: ");
        int r= inp.nextInt();
        int topN=1,topR=1,totalNeksir=1;
        for(int i=1;i<=n;i++){
            topN*=i;
        }
        System.out.println("n!= "+topN);
        for(int j=1;j<=r;j++){
            topR*=j;
        }
        System.out.println("r!= "+topR);
        for(int k=1;k<=(n-r);k++){
            totalNeksir*=k;
        }
        System.out.println("(n-r)!= "+totalNeksir);
        double sonuc=topN/(topR*(totalNeksir));
        System.out.println(sonuc);
    }
} //www.patika.dev
