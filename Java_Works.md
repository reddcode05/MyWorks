# My Grading System using Java☕

This is a grading system in Java☕ for Students🧑‍🎓 who want to learn about their grades. 

I have three different grading systems that I created.
`
Happy Coding!❤️
`

---

## First:  
To input your grades in one subject. Such as quizzes OR activities, performance tasks, and exams.
```Java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("What is your subject: ");
            String subs = in.next();
            System.out.print("Choose your quarter: (Prelim,Midterm,PreFinal,Final) > ");
            String cho = in.next();
            System.out.println("You choose: " + cho);
            System.out.println("Now Let's Start!");
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
                int score = in.nextInt();`
                System.out.print("to: ");
                int _to = in.nextInt();
                $score += score;
                $to += _to;
            }
            System.out.println($score + " / " + $to);
            double result = ((double)$score / (double) $to) * .20 * 100;
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
            double result1 = ((double)$scorePt / (double)$toPt) * .30 * 100;
            System.out.printf("The result of your performance task is %.2f/30\n", result1);
            //exam 
            System.out.println("================================================");
            System.out.print("What is the score of your exam: ");
            int exam = in.nextInt();
            System.out.print("to? ");
            int to = in.nextInt();
            System.out.println(exam + " / " + to);
            double result2 = ((double)exam / (double)to) * .50 * 100;
            System.out.printf("The result of your exam is %.2f/50\n", result2);
            //output
            System.out.println("================================================");
            System.out.println("OUTPUT: \n");
            System.out.println("Your subject: "+ subs);
            System.out.println("You choose: " + cho);
            System.out.printf("Your quiz and activity score: %.2f/20\n", result);
            System.out.printf("Your performance task score: %.2f/30\n", result1);
            System.out.printf("Your exam score: %.2f/50\n", result2);
            double finalRes = result + result1 + result2;
            System.out.printf("The your Final result: %.2f / 100\n",finalRes);
            //Selection
            if (finalRes < 0 || finalRes > 100) {
                System.out.println("The Grade is NOT valid");
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
            System.err.println("Try again!");
        }
    }
}
```

---

## Second: 
To input all your grades for one quarter.
```Java
import java.util.Scanner;
public class Main {
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
            if (finalRes < 0 || finalRes > 100) {
                System.out.println("The Grade is NOT valid");
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
```

---

## Third: 
To input your 4 quarters to know if you passed this sem.
```Java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Grading_System part 2 for prelim to final grade
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("===============Grading System Part 2================");
            System.out.print("Prelim: ");
            double prelim = sc.nextDouble();
            System.out.print("Midterm: ");
            double midTerm = sc.nextDouble();
            System.out.print("Pre-Final: ");
            double pre_Final = sc.nextDouble();
            System.out.print("Final: ");
            double $final = sc.nextDouble();
            double result = (prelim * .20) + (midTerm * .20) + (pre_Final * .20) + ($final * .40);
            System.out.printf("Your Final score: %.2f", result);
            if (finalRes < 0 || finalRes > 100) {
                System.out.println("The Grade is NOT valid");
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
        } catch (Exception e) {
            System.err.println("Again...");
        }
    }
}
```
