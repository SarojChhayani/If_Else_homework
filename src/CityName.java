import java.util.Scanner;

//Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry
public class CityName {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any alphabet from a to f");
        char alphabet=scanner.next().charAt(0);
        // Check the input and print the corresponding city name with if-else statements
        if (alphabet=='a'|| alphabet=='A'){
            System.out.println("City: Agra");
        } else if (alphabet == 'b' || alphabet == 'B') {
            System.out.println("City: Bangalore");
        } else if (alphabet == 'c' || alphabet == 'C') {
            System.out.println("City: Chennai");
        } else if (alphabet == 'd' || alphabet == 'D') {
            System.out.println("City: Delhi");
        } else if (alphabet == 'e' || alphabet == 'E') {
            System.out.println("City: Edinburgh");
        } else if (alphabet == 'f' || alphabet == 'F') {
            System.out.println("City: Florence");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
