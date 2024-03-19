//WAP to input any number and fid our if it is positive , negative or zero

import java.util.Scanner;

public class Positive_negative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();

        //print the result using if-else statements
        if (number > 0) {
            System.out.println("Given number is Positive");
        } else if (number < 0) {
            System.out.println("Given Number is Negative");
        } else {
            System.out.println("Given number is Zero");
        }
    }
}

