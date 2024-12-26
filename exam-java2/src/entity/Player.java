package entity;

public class Player {
	private int playerId;
	private int nationalId;
	private String playerName;
	private int highScore;
	private int level;
	private String nationalName;
	
	public Player(int playerId, int nationalId, String playerName, int highScore, int level) {
		super();
		this.playerId = playerId;
		this.nationalId = nationalId;
		this.playerName = playerName;
		this.highScore = highScore;
		this.level = level;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", nationalId=" + nationalId + ", playerName=" + playerName
				+ ", highScore=" + highScore + ", level=" + level + "]";
	}
	public void displayInfo() {
		System.out.println("Player [playerId=" + playerId  + ", playerName=" + playerName
				+ ", highScore=" + highScore + ", level=" + level + ", National: " + nationalName + "]");
	}
	
}
