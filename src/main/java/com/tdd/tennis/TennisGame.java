package com.tdd.tennis;

public class TennisGame {

	private int playerScore;

	private String playerOneName;

	public TennisGame() {
		playerOneName = "Player One";
	}

	public int getPlayerOneScoredPoint() {
		return playerScore;
	}

	public String getPlayerOneName() {
		return playerOneName;
	}

}
