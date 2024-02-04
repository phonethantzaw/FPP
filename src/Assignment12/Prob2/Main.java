package Assignment12.Prob2;


public class Main {
    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount("Mike", 123, 300.0);


        try {
            ca.deposit(200.0);
            System.out.println("Balance after deposit: " + ca.getBalance());

            ca.withdraw(300.0);
            System.out.println("Balance after withdrawal: " + ca.getBalance());

            ca.withdraw(1000.0);

        } catch (BalanceInsufficientException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}

