//WAP to input any year like 1989 and find out if it is leap year
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any Year");
        int year= scanner.nextInt();
        //Check it is leap year or not and print the result using if-else statements
        if (year%4==0){
            System.out.println(year+" is a Leap Year");
        }
        else {
            System.out.println(year+" is not a Leap Year");
        }
    }
}
