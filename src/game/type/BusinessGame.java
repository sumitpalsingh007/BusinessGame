package game.type;

import bank.Bank;
import cell.Cell;
import game.Game;
import player.User;

import java.util.List;

public class BusinessGame implements Game{

    private static Game game;

     List<User> players;
     List<Cell> cells;
     Bank bank;


    public void initialize(final List<User> users, final List<Cell> inputCells, final Bank inputBank) {
       players = users;
       cells = inputCells;
       bank = inputBank;
    }


    public void startGame() {
     // TODO :: implement
    }


    public void calculateWinner() {
        //TODO :: implement
    }

    public Bank getBank() {
        return bank;
    }

    public List<User> getPlayers() {
        return players;
    }

    public static Game  getInstance() {
        if (game == null) {
            game = new BusinessGame();
        }
        return game;
    }
}
