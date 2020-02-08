package player;

public class User {

    int balance;

    int assetValue;

    public User(int balance) {
        this.balance = balance;
    }

    public void setAssetValue(int assetValue) {
        this.assetValue = assetValue;
    }

    public int getBalance() {
        return balance;
    }

    public int getAssetValue() {
        return assetValue;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
