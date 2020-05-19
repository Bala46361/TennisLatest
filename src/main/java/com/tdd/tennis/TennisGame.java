package com.tdd.tennis;

public class TennisGame {

	private int playerScore;

	private String playerOneName;
	private String playerTwoName;

	public TennisGame() {
		playerOneName = "Player One";
		playerTwoName = "Player Two";
	}

	public int getPlayerOneScoredPoint() {
		return playerScore;
	}

	public String getPlayerOneName() {
		return playerOneName;
	}

	public String getPlayerTwoName() {
		return playerTwoName;
	}

}
