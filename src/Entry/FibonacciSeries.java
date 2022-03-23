package Entry;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 1, b = 1, ref = 1, sum = 0;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < 12; i++) {
            ref = a;
            sum = ref + b;
            a = sum;
            b = ref;
            System.out.print(sum+" ");
        }
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev