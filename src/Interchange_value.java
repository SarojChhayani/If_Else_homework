//WAP to input any two numbers and then print their interchanged value
import java.util.Scanner;

public class Interchange_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number");
        int num2 = scanner.nextInt();


        // Interchange the values
        int interchange = num1;
        num1 = num2;
        num2 = interchange;

        // Print the interchanged values
        System.out.println("Interchanged values");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
