public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    private static int counter = 1000;

    public BankAccount(String ownerName, double balance) {

        this.accountNumber = generateAccountNumber();

        if (ownerName != null && ownerName.length() >= 3) {
            this.ownerName = ownerName;
        } else {
            this.ownerName = "Невідомо";
        }

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && ownerName.length() >= 3) {
            this.ownerName = ownerName;
        }
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    private String generateAccountNumber() {
        counter++;
        return "UA" + counter;
    }

    public static BankAccount findAccountByNumber(BankAccount[] accounts, String number) {

        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }
}
