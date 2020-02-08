package game;

import bank.Bank;
import cell.Cell;
import player.User;

import java.util.List;

public interface Game {

    void initialize(final List<User> users, final List<Cell> cells, final Bank bank);

    void startGame();

    void calculateWinner();

}
