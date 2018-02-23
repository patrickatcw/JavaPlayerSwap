/*Idea
-make a program with teams and see if you can swap
players out between those teams*/

package com.me;

import java.util.Arrays;

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
        printTeam(blue, "Blue");
        printTeam(red, "Red");
        printTeam(orange, "Orange");
        printTeam(neon, "Neon");
        printTeam(purple, "Purple");

        printTeam(blue, "Blue");
        blue.replacePlayer("Buck", "JimBob");
        printTeam(blue, "Blue");

        System.out.println("Done with first version of Team, using ArrayTeam now");

        TeamWithArray blueWithArray = new TeamWithArray("Bob", "Bill", "Bo", "Ben", "Buck");

        printTeam(blueWithArray, "Blue With Array");
        blueWithArray.replacePlayer("Bill", "Bandit");
        printTeam(blueWithArray, "Blue With Array");

    }

    private static void printTeam(TeamWithArray teamWithArray, String teamName) {
        String team = Arrays.toString(teamWithArray.getTeamMembers());
        System.out.println(teamName + ": " + team);
    }

    private static void printTeam(Team team, String teamName) {
        System.out.println("Team " + teamName + ": " + team.getPlayer1() + ", " + team.getPlayer2() + ", " + team.getPlayer3()
                + ", " + team.getPlayer4() + ", " + team.getPlayer5());
    }

}
