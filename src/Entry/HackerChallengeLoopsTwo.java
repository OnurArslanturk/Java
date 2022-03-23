package Entry;
import java.util.*;
import java.io.*;
public class HackerChallengeLoopsTwo {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a, x=1;

            for (int j =n; j>0;j--)
            {
                ;
                for (int k=j;k<=j;k++)
                {
                    sum += (x*b);
                    x*=2;

                }

                System.out.print(sum+" ");
                n*=2;
            }
            System.out.println(" ");
        }
        in.close();
    }
}
