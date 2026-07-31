
public class CoffeeWithDiscount {

    public static void main(String[] args) {

        /*
        Coffee with discount:
        The Coffee Machine has black,mix,and white coffee.
        If total is more than 500 give 10 percent discount.
         */
        double black = 50.25;
        double mix = 75.30;
        double white = 50.25;

        double[] cof = {black, mix, white};
        double percent = 90; // if 10 percent we are loss so 10 minus 100 equal 90
        double total = 0.0;

        int[] buyer = {2, 5, 3};

        for (int i = 0; i < cof.length; i++) {
            double subTotal = cof[i] * buyer[i];
            total += subTotal;
            System.out.printf(" $%.2f * x%d = $%.2f %n", cof[i], buyer[i], subTotal);
        }

        double fiTotal = 0;
        if (total >= 500) {
            fiTotal = total * percent;
            System.out.printf("Total with Discount: %.2f%n", fiTotal);
        } else {
            System.out.printf("Total: %.2f $%n", total);
        }
    }
}

