public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Іван", 5000);
        BankAccount acc2 = new BankAccount("Марія", 3000);
        BankAccount acc3 = new BankAccount("Олег", 2000);

        BankAccount[] accounts = {acc1, acc2, acc3};

        acc1.deposit(1000);

        acc2.withdraw(500);

        acc3.withdraw(5000);

        acc1.setOwnerName("Петро");
      
        for (BankAccount acc : accounts) {
            System.out.println("Номер: " + acc.getAccountNumber());
            System.out.println("Власник: " + acc.getOwnerName());
            System.out.println("Баланс: " + acc.getBalance());
            System.out.println("-----------------------");
        }

        BankAccount found = BankAccount.findAccountByNumber(accounts, acc2.getAccountNumber());

        if (found != null) {
            System.out.println("Рахунок знайдено: " + found.getOwnerName());
        }
    }
}
