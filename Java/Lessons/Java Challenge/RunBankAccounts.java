package MainPackages;

class BankAccount {

    private String accountHolder;
    private double balance;
    public static int totalAccounts;
    public static String bankName;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("insufficient funds for " + accountHolder);
        }
    }

    public void printStatement() {
        System.out.println("The " + accountHolder);
        System.out.println("Current balance " + balance);
    }

    public static void printBankSummary() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Number of accounts that exist system-wide: "+ totalAccounts);
    }
}

public class RunBankAccounts {

    public static void main(String[] args) {
        BankAccount.bankName="National Java Bank";
        
        BankAccount ba1 = new BankAccount("Red d code",1500);
        BankAccount ba2 = new BankAccount("white d code",2000);
        BankAccount ba3 = new BankAccount("black d code",3000);
        
        ba1.deposit(500);
        ba2.deposit(200);
        ba3.deposit(100);
        
        ba1.withdraw(800);
        ba2.withdraw(100);
        ba3.withdraw(700);
        
        ba1.printStatement();
        ba2.printStatement();
        ba3.printStatement();
        
        BankAccount.printBankSummary();
    }

}
