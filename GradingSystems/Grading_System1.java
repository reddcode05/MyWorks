package practive1;

import java.util.Scanner;

public class Grading_System1 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("What is your subject: ");
            String subs = in.next();
            System.out.print("Choose your quarter: (Prelim,Midterm,PreFinal,Final) > ");
            String cho = in.next();

            switch (cho.toLowerCase()) {
                case "prelim", "midterm", "prefinal", "final":
                    System.out.println("You chose: " + cho);
                    break;
                default:
                    System.out.println("You Chose: Invalid input!");
                    break;
            }

            System.out.print("How many is your quiz OR activity: ");
            int quizORact = in.nextInt();
            System.out.print("How many is your performance task: ");
            int pt = in.nextInt();

            //quiz or act
            System.out.println("================================================");
            System.out.println("Input your quiz or activity score and to: ");
            int $score = 0;
            int $to = 0;
            for (int i = 1; i <= quizORact; i++) {
                System.out.print("Your score: ");
                int score = in.nextInt();

                System.out.print("to: ");
                int _to = in.nextInt();

                $score += score;
                $to += _to;
            }
            System.out.println($score + " / " + $to);

            double result = ((double) $score / (double) $to) * .20 * 100;
            System.out.printf("The result of your quiz or act is %.2f/20\n", result);

            //performance task
            System.out.println("================================================");
            System.out.println("Input your performance score and to: ");
            int $scorePt = 0;
            int $toPt = 0;
            for (int i = 1; i <= pt; i++) {
                System.out.print("Your score: ");
                int scorePt = in.nextInt();

                System.out.print("to: ");
                int toPt = in.nextInt();

                $scorePt += scorePt;
                $toPt += toPt;
            }

            System.out.println($scorePt + " / " + $toPt);
            double result1 = ((double) $scorePt / (double) $toPt) * .30 * 100;
            System.out.printf("The result of your performance task is %.2f/30\n", result1);

            //exam 
            System.out.println("================================================");
            System.out.print("What is the score of your exam: ");
            int exam = in.nextInt();
            System.out.print("to? ");
            int to = in.nextInt();

            System.out.println(exam + " / " + to);
            double result2 = ((double) exam / (double) to) * .50 * 100;
            System.out.printf("The result of your exam is %.2f/50\n", result2);
            //output
            System.out.println("================================================");
            System.out.println("OUTPUT: \n");
            System.out.println("Your subject: " + subs);
            System.out.println("You choose: " + cho);
            System.out.printf("Your quiz and activity score: %.2f/20\n", result);
            System.out.printf("Your performance task score: %.2f/30\n", result1);
            System.out.printf("Your exam score: %.2f/50\n", result2);

            double finalRes = result + result1 + result2;
            System.out.printf("The your Final result: %.2f / 100\n", finalRes);

            //Selection
            if (finalRes < 0 || finalRes > 100) {
                System.out.println("Invalid!");
            } else if (finalRes >= 97.50) {
                System.out.println(" GPA: 1.00 (Excellent)");
            } else if (finalRes >= 94.50) {
                System.out.println(" GPA: 1.25 (Very Good)");
            } else if (finalRes >= 91.50) {
                System.out.println(" GPA: 1.50 (Very Good)");
            } else if (finalRes >= 86.50) {
                System.out.println(" GPA: 1.75 (Very Good)");
            } else if (finalRes >= 81.50) {
                System.out.println(" GPA: 2.00 (Satisfactory)");
            } else if (finalRes >= 76.00) {
                System.out.println(" GPA: 2.25 (Satisfactory)");
            } else if (finalRes >= 70.50) {
                System.out.println(" GPA: 2.50 (Satisfactory)");
            } else if (finalRes >= 65.00) {
                System.out.println(" GPA: 2.75 (Fair");
            } else if (finalRes >= 59.50) {
                System.out.println(" GPA: 3.00 (Fair)");
            } else {
                System.out.println(" GPA: 5.00 (Failed)");
            }

            System.out.println("====================================================");
            System.out.println("End of the Program!");
            in.close();
        } catch (Exception e) {
            System.out.println("Try again...");
        }
    }
}
