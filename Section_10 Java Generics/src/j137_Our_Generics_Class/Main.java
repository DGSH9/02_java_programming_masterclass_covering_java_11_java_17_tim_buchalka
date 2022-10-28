package j137_Our_Generics_Class;

public class Main {
	public static void main(String[] args) {
		FootBallPlayer football1 = new FootBallPlayer("football1");
		SoccerPlayer Soccer1 = new SoccerPlayer("Soccer1");
		BaseBallPlayer BaseBall1 = new BaseBallPlayer("BaseBall1");
		
		Team dgshTeam = new Team("DGSH");
		dgshTeam.addPlayer(BaseBall1);
		dgshTeam.addPlayer(Soccer1);
		dgshTeam.addPlayer(football1);
		
		System.out.println(dgshTeam.numPlayes());
		
	}
}
