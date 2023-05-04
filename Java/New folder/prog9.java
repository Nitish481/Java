import java.util.Scanner;

class BankAccount {
    private static double interestRate = 0.05;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Account no : ");
        String acc_no = sc.nextLine();
        System.out.println("\nEnter the Balance : ");
        double bal = sc.nextDouble();
        System.out.println("\nEnter ROI");
        double rate = sc.nextDouble();
        sc.close();

        BankAccount myAccount = new BankAccount(acc_no, bal);
        BankAccount.setInterestRate(rate);

        myAccount.displayAccountInfo();

        double interestEarned = myAccount.calculateInterest();
        System.out.println("\nInterest earned: " + interestEarned);
        myAccount.displayAccountInfo();
    }
}
