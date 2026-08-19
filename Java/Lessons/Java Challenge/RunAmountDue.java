package MainPackages;

import java.util.Scanner;

class AmountDue {

    public void computeAmountDue(double priceItem) {
        double totalDue = priceItem + (priceItem * .12);
        System.out.println("Amount due is : " + totalDue);

    }

    public void computeAmountDue(double priceItem, double quantity) {
        double totalDue = (priceItem * quantity) + (priceItem * quantity * .12);
        System.out.println("Amount due is : " + totalDue);
    }

    public void computeAmountDue(double priceItem, double quantity, double discountAmount) {
        double totalDue = (priceItem * quantity) - discountAmount + (priceItem * .12);
        System.out.println("Amount due is : " + totalDue);
    }
}

public class RunAmountDue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity, and discount amount");
        
        int choice = sc.nextInt();
        
        if (choice == 1) {
            due.computeAmountDue(sc.nextDouble());
        }else if (choice == 2 ) {
            due.computeAmountDue(sc.nextDouble(), sc.nextDouble());
        }else if (choice == 3){
            due.computeAmountDue(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        
    }
}
