import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any single character from the alphabet");
        char alphabet= scanner.next().charAt(0);
        // Check if the alphabet is a vowel or a consonant and print the result
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
                alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println("Given alphabet is Vowel");
        } else {
            System.out.println("Given alphabet is Consonant");
        }

    }
    }

