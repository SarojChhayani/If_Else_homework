import java.util.Scanner;

public class All_subject_Result {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = scanner.next();

        System.out.println("Enter Roll NO.");
        String roll_no = scanner.next();

        System.out.println("Enter three Subject Marks:");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int total_marks = subject1 + subject2 + subject3;
        System.out.println("Total Marks is :" + total_marks);
        double percentage = total_marks / 3;
        System.out.println("Percentage is " + percentage + "%");
        // assign result and grade with if-else statements

        boolean result;
        if(result = subject1>=35 && subject2>=35 && subject3>=35) {
            System.out.println("Result: Pass");
        }else {
            System.out.println("Result: Fail");
        }

        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("Grade:" + grade);

    }
}


