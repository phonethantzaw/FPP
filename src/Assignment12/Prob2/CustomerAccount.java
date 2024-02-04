package Assignment12.Prob2;

public class CustomerAccount {

    private String cusName;
    private int accNo;
    private double balance;


    public CustomerAccount(String cusName, int accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            return true;
        }

        return false;

    }

    public boolean withdraw(double amount) throws BalanceInsufficientException {

        if (amount < 0) {
            return false;
        }

        if (amount > balance) {
            throw new BalanceInsufficientException("Withdrawal amount exceeds the balance.");
        }


        balance -= amount;

        if (balance < 100) {
            throw new BalanceInsufficientException("Balance reach below 100$.");
        }

        return true;
    }


}
