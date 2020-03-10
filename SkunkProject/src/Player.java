import java.util.Scanner;

public class Player {
	private String PlayerName;
	public double rollScore;
	public double turnScore;
	public double roundScore;
	public double gameScore;

	public Player() {
		this.rollScore = 0;
		this.turnScore = 0;
		this.roundScore = 0;
		this.gameScore = 0;
	}
	public void SetName(String n) {
		PlayerName = n;
	}

	public String getName() {
		return this.PlayerName;

	}

	public void addToRollScore(double lastTotal)
	{
		rollScore += lastTotal;
	}

	public void setRollScore(double newRollScore)
	{
		this.rollScore = newRollScore;
	}

	public double getRollScore()
	{
		return this.rollScore;
	}

	public void setTurnScore(int newScore)
	{
		this.turnScore = newScore;
	}

	public double getTurnScore()
	{
		return this.turnScore;
	}

	public void setRoundScore(int i)
	{
		this.roundScore = i;
	}
	public double getRoundScore()
	{
		return this.roundScore;
	}
}
	