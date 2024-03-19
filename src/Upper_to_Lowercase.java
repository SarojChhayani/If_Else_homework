//Input any alphabet in uppercase and print it in lowercase
import java.util.Scanner;

public class Upper_to_Lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet in uppercase: ");
        String uppercaseInput = scanner.next();

        // Convert the uppercase alphabet to lowercase
        String lowercaseOutput = uppercaseInput.toLowerCase();

        System.out.println("Alphabet in lowercase: " + lowercaseOutput);
    }
}
