package com.me;

import java.util.HashSet;
import java.util.Set;

public class TeamWithSet {

	Set<String> teamMembers;

	public TeamWithSet(String player1, String player2, String player3,
	                   String player4, String player5) {
		this.teamMembers = new HashSet<>();

		teamMembers.add(player1);
		teamMembers.add(player2);
		teamMembers.add(player3);
		teamMembers.add(player4);
		teamMembers.add(player5);
	}

	public void replacePlayer(String playerNameRemove, String playerNameAdd) {
		boolean playerToRemoveIsOnTeam = teamMembers.contains(playerNameRemove);

		if(playerToRemoveIsOnTeam) {
			teamMembers.remove(playerNameRemove);
			teamMembers.add(playerNameAdd);
		}
		else {
			System.out.println(playerNameRemove + " Not found on team");
		}
	}

	public Set<String> getTeamMembers() {
		return teamMembers;
	}
}
