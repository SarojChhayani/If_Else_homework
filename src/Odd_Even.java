//Input any two number and find out its odd or even use turnery operator
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second number");
        int num2 = scanner.nextInt();

        // Determine if the first number is odd or even using ternary operator
        String result_1 = (num1 % 2 == 0) ? "Even" : "Odd";

        // Determine if the second number is odd or even using ternary operator
        String result_2 = (num2 % 2 == 0) ? "Even" : "Odd";

        // Print the results using if-else statements
        if (num1 % 2 == 0) {
            System.out.println("Given First number is even");
        } else {
            System.out.println("Given First number is Odd");
        }
        if (num2 % 2 == 0) {
            System.out.println("Given Second number is even");
        } else {
            System.out.println("Given Second number is odd");
        }
    }
}

