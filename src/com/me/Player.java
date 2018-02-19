package com.me;

public class Player {

    //step 1 create fields for Player
    private String player1;
    private String player2;
    private String player3;
    private String player4;
    private String player5;

    //step 2 make my own constructor method with parameters
    public Player(String player1, String player2, String player3,
                  String player4, String player5){

        //step 3 this. to reference fields
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;

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
