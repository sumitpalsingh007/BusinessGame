package cell.celltypes;

import bank.Bank;
import cell.Cell;
import player.User;

public class JailCell extends Cell {

    @Override
    public void execute(final User user) {
        user.setBalance(user.getBalance() - 150);

        Bank.getInstance().deductMoney(150);
    }
}
