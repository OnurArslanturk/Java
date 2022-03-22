package Entry;
public class AsalSayilar {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 100; i++)
        {
            for (int j = 2; j < 100; j++)
                if (i % j == 0)
                    counter++;
            if (counter < 2) System.out.print(i + " ");
            counter = 0;
        }
    }
}
