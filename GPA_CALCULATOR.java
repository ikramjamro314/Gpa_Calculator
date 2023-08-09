import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class GPA_CALCULATOR {
    public static void main(String[] args) {

        //        GPA CALCULATOR
        Scanner scanner = new Scanner(System.in);
        int num_of_courses;
//            System.out.println("Enter Number Of courses in your Semster : ");
//            num_of_courses = scanner.nextInt();
            num_of_courses = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of courses in your Semster : "));
//            scanner.nextLine();
        double total_credits_hours = 0.0;
        double total_grade_points = 0.0;
        for (int i = 1; i <= num_of_courses; i++) {
            String Sub_name;
//            System.out.println("Enter Subject name : ");
//             Sub_name = scanner.nextLine();
            Sub_name = JOptionPane.showInputDialog("Enter Subject" + i + " name : ");
            String Grade;
            double grade_points;
//                System.out.println("Enter grade of : " + Sub_name);
//                System.out.println(" Enter Grade (A+,A,B+,B,C+,C,C-,F) :");
//                Grade = scanner.nextLine().toUpperCase();
            Boolean istrue=true;
           do {
               istrue=true;
               Grade = JOptionPane.showInputDialog("Enter grade of : " + Sub_name + "\n Enter Grade (A+,A,B+,B,C+,C,C-,F) :");
               Grade = Grade.toUpperCase();
               switch (Grade) {
                   case "A+":
                       grade_points = 4.0;
                       break;
                   case "A":
                       grade_points = 3.5;
                       break;
                   case "B+":
                       grade_points = 3.0;
                       break;
                   case "B":
                       grade_points = 2.5;
                       break;
                   case "C+":
                       grade_points = 2.0;
                       break;
                   case "C":
                       grade_points = 1.5;
                       break;
                   case "C-":
                       grade_points = 1.0;
                       break;
                   case "F":
                       grade_points = 0.0;
                       break;
                   default:
                       istrue=false;
                       JOptionPane.showMessageDialog(null,"Invalid Input! Try Again");
                       grade_points = 0.0;
                       break;
               }
           }while(istrue==false);
            double credit_hours = 0.0;
//                    System.out.println("Enter Credit hours of the subject");
//                    credit_hours = scanner.nextDouble();
           boolean if_true=true;
            do{
                if_true=true;
            credit_hours = Double.parseDouble(JOptionPane.showInputDialog("Enter Credit hours of the subject"));
            if(credit_hours>3) {
                JOptionPane.showMessageDialog(null,"Invalid Input! Please Enter Correct No of Courses ");
                if_true=false;
            }
        }while(if_true==false);
//                    scanner.nextLine();
            total_credits_hours += credit_hours;
            total_grade_points += credit_hours * grade_points;
        }
        float gpa = (float) (total_grade_points / total_credits_hours);
//        System.out.println("Your GPA is : " + gpa);
        JOptionPane.showMessageDialog(null,"Your GPA is : " + gpa);
    }
}