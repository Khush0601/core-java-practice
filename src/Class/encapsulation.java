package Class;
// encapsulation:
class BankAccount {
    private double balance;
    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {

        return balance;
    }
}



public class encapsulation{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(10000);
        System.out.println(account.getBalance());
        account.setBalance(-500);
    }
}

