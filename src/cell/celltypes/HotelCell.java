package cell.celltypes;

import bank.Bank;
import cell.Cell;

import player.User;

public class HotelCell extends Cell {

    private int level;

    private int rent;

    private boolean isOccupied;

    private User owner;

    public HotelCell () {
        level = 0;
        rent = 50;
    }

    @Override
    public void execute(final User user) {
        if (owner == user) {
            //User occupies the hotel
            if (user.getBalance() > getUpgradeFees(level)) {
                if (level == 0) {
                    level++;
                    user.setBalance(user.getBalance() - getUpgradeFees(level));
                    Bank.getInstance().addMoney(getUpgradeFees(level));
                } else if (level == 1) {
                    level++;
                    user.setBalance(user.getBalance() - getUpgradeFees(level));
                    Bank.getInstance().addMoney(getUpgradeFees(level));
                } else if (level == 2) {
                    // not clear to upgrade or not
                }
            }
        } else {
            if (isOccupied) {
                // someone else occupies the hotel
                if (user.getBalance() > getRentBasedOnLevel(level)) {
                    user.setBalance(user.getBalance() - getRentBasedOnLevel(level));
                    Bank.getInstance().addMoney(getRentBasedOnLevel(level));
                } else {
                    // not clear
                }
            } else {
                //no one occupies the hotel
                if (user.getBalance() > 200) {
                    owner = user;
                user.setBalance(user.getBalance() - 200);
                isOccupied = true;
                Bank.getInstance().addMoney(200);
                } else {
                    // not clear
                }
            }
        }
    }

    private int getUpgradeFees(int level) {
        if (level == 0) {

           return 100;
        } else if (level == 1) {
            return 200;
        } else if (level == 2) {
            // not clear to upgrade or not
        }
        return 0;
    }

    private int getRentBasedOnLevel(int level) {

        if (level == 0) {
            return 50;
        } else if (level == 1) {
           return 150;
        } else if (level == 2) {
            return 300;
        }
        return rent;
    }
}
