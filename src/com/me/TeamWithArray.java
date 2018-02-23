package com.me;

public class TeamWithArray {

	private String[] teamMembers;

	public TeamWithArray(String player1, String player2, String player3, String player4, String player5) {
		this.teamMembers = new String[] {
				player1, player2, player3, player4, player5
		};
	}

	public void replacePlayer(String playerNameRemove, String playerNameAdd) {
		for (int i = 0; i < teamMembers.length; i++) {
			String currentTeamMember = teamMembers[i];
			if(currentTeamMember.equals(playerNameRemove)) {
				teamMembers[i] = playerNameAdd;
				break; // don't need to keep looping after we found the team member to replace
			}
		}
	}

	public String[] getTeamMembers() {
		return teamMembers;
	}
}
