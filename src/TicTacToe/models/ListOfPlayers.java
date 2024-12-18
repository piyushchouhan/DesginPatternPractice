package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class ListOfPlayers {
    private final List<Player> players;
    private int currentIndex;

    public ListOfPlayers(){
        players = new ArrayList<>();
        currentIndex = 0;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public Player getNextPlayer(){
        Player player = players.get(currentIndex);
        currentIndex = (currentIndex + 1) % players.size();
        return player;
    }

    public Player getCurrentPlayer(){
        return players.get(currentIndex);
    }
}
