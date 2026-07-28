package practive1;

import java.util.Scanner;
public class Grading_System1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("                 My Grading System                  ");
            System.out.println("====================================================");

            //Input
            System.out.println("Input:");

            System.out.print("How many subjects you have? ");
            int subjects = input.nextInt();

            //Primitive Data Types
            int i = 1;
            double num1;
            double num2 = 0;

            //Repetition
            while (i <= subjects) {
                System.out.print(" "+i + ". Enter your score: ");
                num1 = input.nextDouble();
                num2 += num1;
                i++;
            }
            System.out.println("====================================================");

            // Output
            System.out.println("Output: ");

            // Expressions
            System.out.printf(" Your Score: %.2f\n", num2);
            double result = num2 / subjects;
            System.out.printf(" Result: %.2f%%%n", result);
            
            //Selection
            if (result < 0 || result > 100) {
                System.out.println("Invalid!");
            } else if (result >= 97.50) {
                System.out.println(" GPA: 1.00 (Excellent)");
            } else if (result >= 94.50) {
                System.out.println(" GPA: 1.25 (Very Good)");
            } else if (result >= 91.50) {
                System.out.println(" GPA: 1.50 (Very Good)");
            } else if (result >= 86.50) {
                System.out.println(" GPA: 1.75 (Very Good)");
            } else if (result >= 81.50) {
                System.out.println(" GPA: 2.00 (Satisfactory)");
            } else if (result >= 76.00) {
                System.out.println(" GPA: 2.25 (Satisfactory)");
            } else if (result >= 70.50) {
                System.out.println(" GPA: 2.50 (Satisfactory)");
            } else if (result >= 65.00) {
                System.out.println(" GPA: 2.75 (Fair");
            } else if (result >= 59.50) {
                System.out.println(" GPA: 3.00 (Fair)");
            } else {
                System.out.println(" GPA: 5.00 (Failed)");
            }

            System.out.println("====================================================");
            System.out.println("End of the Program!");
            input.close();
        } catch (Exception e) {
            System.err.println("Again...");
        }
    }
}
