package j137_Our_Generics_Class;

import java.util.ArrayList;

public class Team {
	
	private String teamName;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	ArrayList<Player> membersList = new ArrayList<Player>();
	
	//add mebers
	public boolean addPlayer(Player player) {
		if(membersList.contains(player)) {
//			System.out.println("Player already exist");
			return false;
		}
		else {
			membersList.add(player);
//			System.out.println(player +"Player added on team : " + this.teamName);
			return true;
		}
	}
	
	
	//total numbers opf player
	public int numPlayes() {
		return this.membersList.size();
	}
	
	
	//match result
	public void matchResult(Team opponent, int ourScore, int theirScore) {
		if(ourScore>theirScore) {
			won++;
		}
		else if (theirScore>ourScore) {
			lost++;
		}
		else if (ourScore==theirScore) {
			tied++;
		}
		played++;
		if(opponent!=null) {
			opponent.matchResult(null, ourScore, theirScore);
		}
	}
	
	//ranking
	public int ranking() {
		return (won*2)+tied;
	}
	
	public Team(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	
	
	
	
	
	
	
	
	
	
	
}
