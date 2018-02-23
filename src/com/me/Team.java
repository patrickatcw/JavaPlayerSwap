package com.me;

public class Team {

    //step 1 create fields for Player
    private String player1;
    private String player2;
    private String player3;
    private String player4;
    private String player5;

    //step 2 make my own constructor method with parameters
    public Team(String player1, String player2, String player3,
                  String player4, String player5){

        //step 3 this. to reference fields
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;

    }

    //step 7 methods to switch players          ****work on this
    //i want to replace one player with another player on different teams
    public void replacePlayer(String playerNameRemove, String playerNameAdd){
        if(playerNameRemove.equals(player1)) {
            player1 = playerNameAdd;
        }
        else if(playerNameRemove.equals(player2)) {
            player2 = playerNameAdd;
        }
        else if(playerNameRemove.equals(player3)) {
            player3 = playerNameAdd;
        }
        else if(playerNameRemove.equals(player4)) {
            player4 = playerNameAdd;
        }
        else if(playerNameRemove.equals(player5)) {
            player5 = playerNameAdd;
        }
        else {
            System.out.println(playerNameRemove + " not on this team.");
        }

    }

    //step 4 create getters
    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getPlayer3() {
        return player3;
    }

    public String getPlayer4() {
        return player4;
    }

    public String getPlayer5() {
        return player5;
    }
}
