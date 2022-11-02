package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private boolean handLeft;
	private boolean shootLeft;
	private int goals;//
	private int assists;//
	private int points;//
	private int games;//
	
	public HockeyPlayer() {
		
	}
	
    public HockeyPlayer(String name, int number, boolean handLeft, boolean shootLeft) {
    	this.name = name;
    	this.number = number;
    	this.handLeft = handLeft;
    	this.shootLeft = shootLeft;
    }
    
    public void playGame(int g, int a) {
    	goals += g;
    	assists += a;
    	points += g*a;
    	games ++;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isHandLeft() {
		return handLeft;
	}

	public void setHandLeft(boolean handLeft) {
		this.handLeft = handLeft;
	}

	public boolean isShootLeft() {
		return shootLeft;
	}

	public void setShootLeft(boolean shootLeft) {
		this.shootLeft = shootLeft;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "HockeyPlayer " + name + ", number=" + number + ", goals=" + goals + ", assists=" + assists + ", points=" + points + ", games=" + games
				;
	}
    
	public static void main(String[] args) {
		HockeyPlayer h = new HockeyPlayer("Xiaoming",100,false,false);
		h.playGame(5, 3);
		System.out.println(h);
	}
    

}
