import java.util.Scanner;

//WAP to input student name, roll no, 3 subjects marks.and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
//>= 35 C
public class Percentage_Result {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name= scanner.next();

        System.out.println("Enter Roll NO.");
        String roll_no=scanner.next();

        System.out.println("Enter Marks for Subject 1:");
        int subject1=scanner.nextInt();
        System.out.println("Enter Marks for Subject 2:");
        int subject2=scanner.nextInt();
        System.out.println("Enter Marks for Subject 3:");
        int subject3= scanner.nextInt();
        int total_marks= subject1+subject2+subject3;
        System.out.println("Total Marks is :"+ total_marks);
        double percentage= total_marks/3;
        System.out.println("Percentage is "+percentage+"%");
        // assign result and grade with if-else statements
        String result;
        if (percentage>=35){
            result= "Pass";
        }else {
            result= "Fail";
        }
        System.out.println("Result: "+ result);

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
        System.out.println("Grade:"+ grade);

    }
}
    