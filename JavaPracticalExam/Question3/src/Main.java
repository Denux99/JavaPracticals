
class BankAccount{
    private double balance;
    private int accountNumber;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }



}


public class Main {
    public static void main(String[] args) {

        BankAccount newAccount = new BankAccount();
        //set values using setter methods
        newAccount.setBalance(5000.59);
        newAccount.setAccountNumber(3590584);

        // Retrieve values using getter methods
        double balance = newAccount.getBalance();
        int accountNumber = newAccount.getAccountNumber();

        System.out.println("Account " + accountNumber);
        System.out.println("Balance " + balance);

    }
}