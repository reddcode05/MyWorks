package practive1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Calculator:
        1.input
        2.switch
        3.Output
        Description: 
        This is a Basic Calculator. This is only use the four symbols such as +,-,/,*.
         */
        System.out.print("Input a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input a symbol: (+,-,*,/) ");
        char symbol = sc.next().charAt(0);
        System.out.print("Input a number: ");
        double num2 = sc.nextDouble();
        double res = 0;
        switch (symbol) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
        System.out.println("Resul: " + res);
        sc.close();
    }
}
