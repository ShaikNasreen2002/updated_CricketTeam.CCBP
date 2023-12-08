// Write your code here. 
package com.example.player;

public class Player {
    /*
     * private int id;
     * private String name;
     * private int jerseyNum;
     * private String role;
     * 
     * Player(int id, String name, int jerseyNum, String role) {
     * this.id = id;
     * this.name = name;
     * this.jerseyNum = jerseyNum;
     * this.role = role;
     * }
     */
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getId() {
        return playerId;
    }

    public void setId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }

    public int getjerseyNum() {
        return jerseyNumber;
    }

    public void setjerseyNum(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
