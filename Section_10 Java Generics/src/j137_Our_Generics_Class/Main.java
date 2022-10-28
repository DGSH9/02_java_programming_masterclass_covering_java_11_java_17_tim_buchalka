package j137_Our_Generics_Class;

public class Main {
	public static void main(String[] args) {
		FootBallPlayer football1 = new FootBallPlayer("football1");
		SoccerPlayer Soccer1 = new SoccerPlayer("Soccer1");
		BaseBallPlayer BaseBall1 = new BaseBallPlayer("BaseBall1");
		
		Team<FootBallPlayer> team1 = new Team<>("Team1");
		team1.addPlayer(football1);
		
		
		Team<BaseBallPlayer> team2 = new Team<>("Team2");
		team2.addPlayer(BaseBall1);
		
		Team<SoccerPlayer> team3 = new Team<SoccerPlayer>("Team3");
		team3.addPlayer(Soccer1);
		
		System.out.println();
	}
}
