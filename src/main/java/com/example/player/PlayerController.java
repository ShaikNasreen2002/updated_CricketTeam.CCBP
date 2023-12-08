/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here. 
package com.example.player;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.example.player.PlayerService;
import com.example.player.Player;
import java.util.*;

@RestController
public class PlayerController {

    PlayerService playerService = new PlayerService();

    @GetMapping("/players")

    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    /*
     * public List<Player> getPlayers() {
     * return playerService.getPlayers();
     * }
     */

    @GetMapping("/players/{playerId}")
    public Player getplayer(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }

    /*
     * public ResponseEntity<Player> getPlayerById(@PathVariable int playerId) {
     * Player player = playerService.getPlayerById(playerId);
     * 
     * if (player != null) {
     * return new ResponseEntity<>(player, HttpStatus.OK);
     * } else {
     * return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     * }
     * }
     */

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }
    /*
     * public ResponseEntity<Player> addPlayer(@RequestBody Player newPlayer) {
     * Player addedPlayer = playerService.addPlayer(newPlayer);
     * 
     * if (addedPlayer != null) {
     * return new ResponseEntity<>(addedPlayer, HttpStatus.CREATED);
     * } else {
     * return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
     * }
     * }
     */

    @PutMapping("/players/{playersId}")
    public Player updatePlayer(@RequestBody Player player, @PathVariable("playerId") int playerId) {
        return playerService.updatePlayer(player, playerId);
    }

    // Exception handler for MissingPathVariableException
    /*
     * @ResponseStatus(HttpStatus.BAD_REQUEST)
     * 
     * @org.springframework.web.bind.annotation.ExceptionHandler(org.springframework
     * .web.bind.MissingPathVariableException.class)
     * public String
     * handleMissingPathVariableException(org.springframework.web.bind.
     * MissingPathVariableException ex) {
     * return "Error: Path variable '" + ex.getVariableName() + "' is missing";
     * }
     */

    @DeleteMapping("/players/{playersId}")
    public void deletePlayer(@PathVariable("playersId") int playerId) {
        playerService.deletePlayer(playerId);
    }
}
