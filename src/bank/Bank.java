package bank;

public class Bank implements BankInterface {

    private static int balance;

    private static BankInterface bank;

    public static BankInterface getInstance() {
        if (bank == null) {
            bank = new Bank(5000);
        }
        return bank;
    }

    public Bank(int balance) {
        this.balance = balance;
    }

    public int addMoney(int amount) {
        return balance = balance + amount;
    }

    public int deductMoney(int amount) {
        return balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }

}
