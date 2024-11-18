import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String sysin = scanner.nextLine();
        StringDecorator newString = new StringDecorator(sysin);
        newString.asciiDecorator();
        newString.htmlDecorator();
        newString.latexHeaderDecorator();
        newString.jsonDecorator();
        
    }
}