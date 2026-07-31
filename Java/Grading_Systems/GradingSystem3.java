package practive1;

import java.util.Scanner;

public class GradingSystem3 {

    public static void main(String[] args) {
        // Grading_System part 2 for prelim to final grade
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Start The Program!");
            System.out.println("===============Grading System Part 2================");
            System.out.println("INPUT:");
            System.out.print(" Prelim: ");
            double prelim = sc.nextDouble();
            System.out.print(" Midterm: ");
            double midTerm = sc.nextDouble();
            System.out.print(" Pre-Final: ");
            double pre_Final = sc.nextDouble();
            System.out.print(" Final: ");
            double $final = sc.nextDouble();

            double result = (prelim * .20) + (midTerm * .20) + (pre_Final * .20) + ($final * .40);

            System.out.println("====================================================");

            System.out.println("OUTPUT: ");

            System.out.printf(" Your Final score: %.2f\n", result);

            if (result < 0 || result > 100) {
                System.out.println("  Invalid!");
            } else if (result >= 97.50) {
                System.out.println("  GPA: 1.00 (Excellent)");
            } else if (result >= 94.50) {
                System.out.println("  GPA: 1.25 (Very Good)");
            } else if (result >= 91.50) {
                System.out.println("  GPA: 1.50 (Very Good)");
            } else if (result >= 86.50) {
                System.out.println("  GPA: 1.75 (Very Good)");
            } else if (result >= 81.50) {
                System.out.println("  GPA: 2.00 (Satisfactory)");
            } else if (result >= 76.00) {
                System.out.println("  GPA: 2.25 (Satisfactory)");
            } else if (result >= 70.50) {
                System.out.println("  GPA: 2.50 (Satisfactory)");
            } else if (result >= 65.00) {
                System.out.println("  GPA: 2.75 (Fair");
            } else if (result >= 59.50) {
                System.out.println("  GPA: 3.00 (Fair)");
            } else {
                System.out.println("  GPA: 5.00 (Failed)");
            }

            //Update 07/28/26 STI grade; it must be 1.00 to 1.50.
            if (result < 0 || result > 100) {
                System.out.println("    Invalid!");
            } else if (result >= 91.50) {
                System.out.println(" Your grade is less than 1.50 in range so you're TOP grade");
            } else {
                System.out.println(" Your grade is more than 1.50 in range so you're NOT-TOP grade");
            }

            System.out.println("====================================================");
            System.out.println("End of the Program!");
        } catch (Exception e) {
            System.err.println("Again...");
        }
    }
}
