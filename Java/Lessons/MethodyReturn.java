public class MethodyReturn {

    static void Calculator(int num1, int num2, char symbol) {
        int res = 0;

        switch (symbol) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                res = 0;
        }
        System.out.println(res + " VOID");
    }

    static int Calculator(int num1, int num2, char symbol, String over) {
        int res = 0;

        switch (symbol) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                res = 0;
        }
        System.out.println(res + " INT");//To print
        return res ;
        
    }

    public static void main(String[] args) {

        int num1 = 50;
        char symbol = '+';
        int num2 = 25;
        String overLoading = "SIGMA";

        Calculator(num1, num2, symbol);
        Calculator(num1, num2, symbol, overLoading);

    }
}
