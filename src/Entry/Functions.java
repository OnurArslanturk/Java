package Entry;

import java.util.Scanner;
public class Functions {
    static void prime(int num,int i){
        if(num==i) {
        System.out.println("Prime");
        return;
    }
        else if(num%i==0 || num <= 1 ) {
        System.out.println("not prime");
        return;
    }

    i++;
    prime(num,i);

}
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number :");
            int num = inp.nextInt();
            prime(num, 2);
        }
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev

