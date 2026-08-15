package LabExer3;

import java.util.Scanner;

class SavingsAccount {

    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getIntestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("Your new balance is " + account.getBalance());
    }
}

public class RunSavingsAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter interest rate: ");
        SavingsAccount.setInterestRate(sc.nextDouble());

        System.out.print("Enter deposit amount: ");
        savings.deposit(sc.nextDouble());

        System.out.println("Your balance is " + savings.getBalance());

        sc.nextLine();

        System.out.print("Press D for another deposit or W to withdraw: ");
        char press = sc.nextLine().charAt(0);
        if (press == 'D' || press == 'd') {
            System.out.print("Enter deposit amount: ");
            savings.deposit(sc.nextDouble());
        } else if (press == 'W' || press == 'w') {
            System.out.print("Enter withdraw amount: ");
            savings.withdraw(sc.nextDouble());
        }
        if (savings.getBalance() > 1000) {
            savings.addInterest();
        }
        SavingsAccount.showBalance(savings);
        sc.close();
    }
}
