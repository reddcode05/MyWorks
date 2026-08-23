package MainPackages;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Account {

    public static String nickName;
    private String userName;
    private String passWord;
    private double balance = 0;

    final public static double percent = .10;
    public static int count;

    public Account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        count++;
    }

    public static void setNickName(String name) {
        nickName = name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposit(double amount) {
        balance += amount;
        return balance;
    }

    public double getWithdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return balance;
    }

    public double getPercent() {
        return balance = balance + (balance * percent);
    }
}

class AccountSystem {

    ArrayList<Account> accounts = new ArrayList();

    public void addAcc(Account account) {
        accounts.add(account);
    }

    public boolean findUserNames(String userName) {
        for (Account account : accounts) {
            if (userName.equals(account.getUserName())) {
                return true;
            }
        }
        return false;
    }

    public boolean findPassWord(String passWord) {
        for (Account account : accounts) {
            if (passWord.equals(account.getPassWord())) {
                return true;
            }
        }
        return false;
    }

    public void deposit(double amount, String userName) {
        for (Account account : accounts) {
            if (account.getUserName().equals(userName)) {
                account.getDeposit(amount);
                return;
            }
        }
    }

    public void withdraw(double amount, String userName) {
        for (Account account : accounts) {
            if (account.getUserName().equals(userName)) {
                account.getWithdraw(amount);
                return;
            }
        }
    }

    public void displayAllAcc() {
        if (Account.count == 1) {
            System.out.println("Account has " + Account.count + " user.");
        } else {
            System.out.println("Account has " + Account.count + " users.");
        }
        int i = 1;
        for (Account account : accounts) {
            if (account.getBalance() >= 500) {
                account.getPercent();
            }
            System.out.printf("Account #\t: \t%03d\n", i);
            System.out.println("NickName\t: \t" + account.getNickName());
            System.out.println("Balance \t: \t" + account.getBalance());
            i++;
            System.out.println("");
        }
    }

}

class CreateAccSystem {

    static Scanner sc = new Scanner(System.in);
    static AccountSystem as = new AccountSystem();

    public static void firstChoice() {
        System.out.println("===================================================");
        System.out.println("Create Your Account: ");
        boolean isGood = true;
        String userName = "";
        String nickName = "";
        String passWord = "";
        while (isGood != false) {
            boolean isGood1 = true;
            while (isGood1 != false) {
                System.out.print("Enter your userName:(@student.ph): ");
                userName = sc.next();
                Pattern p = Pattern.compile(".*{1,10}@student.ph");
                Matcher m = p.matcher(userName);
                if (m.matches()) {
                    isGood1 = false;
                    System.out.println("The UserName is Complete.");
                } else {
                    System.out.println("The UserName is Not Good Plz Try Again...");
                }
            }
            sc.nextLine();
            boolean isGood2 = true;
            while (isGood2 != false) {
                System.out.print("Enter your PassWord: (8 Character Only): ");
                passWord = sc.next();
                Pattern p = Pattern.compile(".{8}");
                Matcher m = p.matcher(passWord);
                if (m.matches()) {
                    isGood2 = false;
                    System.out.println("The PassWord is Complete.");
                } else {
                    System.out.println("The PassWord is Has only 8 character only Plz Try Again...");
                }
            }
            isGood = false;
            sc.nextLine();
            boolean isGood4 = true;
            while (isGood4 != false) {
                System.out.print("Enter your NickName: ");
                nickName = sc.next();
                Pattern p = Pattern.compile(".*{1,10}");
                Matcher m = p.matcher(nickName);
                if (m.matches()) {
                    isGood4 = false;
                    System.out.println("The NickName is Complete.");
                } else {
                    System.out.println("The NickName it must be 1 to 10 character only Plz Try Again...");
                }
            }
        }
        as.addAcc(new Account(userName, passWord));
        Account.setNickName(nickName);
    }

    public static void secondChoice() {
        System.out.println("===================================================");
        as.displayAllAcc();
    }

    public static void ThirdChoice() {
        System.out.println("===================================================");
        String userName = "";
        String passWord = "";
        char choice;
        char choose;
        boolean hasAccess1 = false;
        boolean hasAccess2 = false;
        double amount;
        System.out.println("Login Your Account:");
        boolean isGood = true;
        while (isGood != false) {
            boolean isGood1 = true;
            while (isGood1 != false) {
                System.out.print("Enter your UserName: ");
                userName = sc.next();
                hasAccess1 = as.findUserNames(userName);
                if (hasAccess1) {
                    System.out.println("The UserName is Access!");
                }

                System.out.print("Enter your PassWord: ");
                passWord = sc.next();
                hasAccess2 = as.findPassWord(passWord);
                if (hasAccess2) {
                    System.out.println("The PassWord is Access!");
                }
                isGood1 = false;
            }
            boolean isGood2 = true;
            while (isGood2 != false) {
                if (hasAccess1 && hasAccess2) {
                    System.out.print("Enter a D to deposit || W to withdraw: ");
                    choice = sc.next().charAt(0);
                    if (choice == 'D' || choice == 'd') {
                        System.out.print("Enter amount: ");
                        amount = sc.nextDouble();
                        as.deposit(amount, userName);
                    } else if (choice == 'W' || choice == 'w') {
                        System.out.print("Enter amount: ");
                        amount = sc.nextDouble();
                        as.deposit(amount, userName);
                    } else {
                        System.out.println("Error Plz Try Again...");
                    }
                }
                System.out.print("You have to do more? (Y/N) ");
                choose = sc.next().charAt(0);
                if (choose == 'N' || choose == 'n') {
                    System.out.println("You are Back of the Start.");
                    isGood2 = false;
                }
            }
            isGood = false;
        }
    }

    public static void fourthChoice() {
        System.out.println("===================================================");
        System.out.println("The Purpose of This System is to create system \nthat can add the account and login then, the \naccount has balance that can change using deposit \nand withdraw. ");
    }
}

public class Main {

    public static void main(String[] args) {
        // Create with Logic Account and can diposit a balance and withdraw
        try {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            while (choice != 5) {
                System.out.println("===================================================");
                System.out.println("              Click a number to choice             ");
                System.out.println("1. Create Account                                  ");
                System.out.println("2. Display all Accounts                            ");
                System.out.println("3. Login Account                                   ");
                System.out.println("4. Menu");
                System.out.println("5. Exit");

                System.out.print("Input you choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    // Create Account
                    CreateAccSystem.firstChoice();
                } else if (choice == 2) {
                    // display All acounts
                    CreateAccSystem.secondChoice();
                } else if (choice == 3) {
                    // Login account to deposit and withdraw a balance
                    CreateAccSystem.ThirdChoice();
                } else if (choice == 4) {
                    // Menu
                    CreateAccSystem.fourthChoice();
                } else if (choice == 5) {
                    // exit
                } else {
                    System.out.println("Input Error Plz Try Again...");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
