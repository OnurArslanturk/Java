package Entry;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;
public class Operator {
    public class ScannerDemo {
        public static void main(String[] args) {

            String s = "Hello World! 3 + 3.0 = 6.0 true ";

            // create a new scanner with the specified String Object
            Scanner scanner = new Scanner(s);

            // skip the word that matches the pattern ..llo
            scanner.skip(Pattern.compile("..llo"));

            // print a line of the scanner
            System.out.println("" + scanner.nextLine());

            // close the scanner
            scanner.close();
        }
    }
}
