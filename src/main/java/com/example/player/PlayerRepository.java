// Write your code here
package com.example.player;

import java.util.*;

import com.example.player.Player;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();
    // List<Player> getPlayers();

    Player getPlayerById(int val);

    Player addPlayer(Player player);

    Player updatePlayer(Player player, int playerId);

    void deletePlayer(int playerId);

}
