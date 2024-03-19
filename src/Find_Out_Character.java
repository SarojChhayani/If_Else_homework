import java.util.Scanner;

class Find_Out_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        //Check if the character is an alphabet
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("The entered character is an alphabet.");
        }
        //Check if the character is a number (0-9)
        else if (input >= '0' && input <= '9') {
            System.out.println("The entered character is a number.");
        }
        //Check if the character is a symbol
        else {
            System.out.println("The entered character is a symbol.");
        }


    }
}
