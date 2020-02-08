package cell.celltypes;

import bank.Bank;
import cell.Cell;
import player.User;

public class LotteryCell extends Cell {

    @Override
    public void execute(User user) {
        user.setBalance(user.getBalance() + 200);

        Bank.getInstance().addMoney( 200);
    }
}
