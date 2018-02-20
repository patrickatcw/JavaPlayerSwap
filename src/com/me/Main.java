/*Idea
-make a program with teams and see if you can swap
players out between those teams*/

package com.me;

public class Main {

    public static void main(String[] args) {

        //step 5 building new instances using constructors
        Team blue = new Team("Bob", "Bill", "Bo", "Ben", "Buck");
        Team red = new Team("Rick", "Rob", "Rita", "Renee", "Rudy");
        Team orange = new Team("Otter", "Othello", "Oscar", "Octavian", "Oren");
        Team neon = new Team("Nancy", "Ned", "Nelly", "Nick", "Natalie");
        Team purple = new Team("Pete", "Pam", "Pandit", "Phun-shu", "Pogo");

        //step 6 do printouts
        System.out.println("-------------------------------------------------");
        System.out.println("Here are the team rosters for the player swap;");
        System.out.println();
        System.out.println("Team Blue: " + blue.getPlayer1() + ", " + blue.getPlayer2() + ", " + blue.getPlayer3()
                + ", " + blue.getPlayer4() + ", " + blue.getPlayer5());
        System.out.println("Team Red: " + red.getPlayer1() + ", " + red.getPlayer2() + ", " + red.getPlayer3()
                + ", " + red.getPlayer4() + ", " + red.getPlayer5());
        System.out.println("Team Orange: " + orange.getPlayer1() + ", " + orange.getPlayer2() + ", " + orange.getPlayer3()
                + ", " + orange.getPlayer4() + ", " + orange.getPlayer5());
        System.out.println("Team Neon: " + neon.getPlayer1() + ", " + neon.getPlayer2() + ", " + neon.getPlayer3()
                + ", " + neon.getPlayer4() + ", " + neon.getPlayer5());
        System.out.println("Team Purple: " + purple.getPlayer1() + ", " + purple.getPlayer2() + ", " + purple.getPlayer3()
                + ", " + purple.getPlayer4() + ", " + purple.getPlayer5());
        System.out.println("-------------------------------------------------");
        System.out.println();

    }

}
