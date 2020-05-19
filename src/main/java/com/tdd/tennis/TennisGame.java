package com.tdd.tennis;

import com.tdd.tennis.model.Player;

public class TennisGame {

	private static final String[] scoreDescription = { "Love", "Fifteen" };

	private Player playerOne;
	private Player playerTwo;

	public TennisGame() {
		playerOne = new Player("Player One");

		playerTwo = new Player("Player Two");
	}

	protected Player getPlayerOne() {
		return playerOne;
	}

	protected Player getPlayerTwo() {
		return playerTwo;
	}

	public String calculateGameScore() {
		
		if (playerOne.getScoredPoint() == playerTwo.getScoredPoint()) {
			return scoreDescription[playerOne.getScoredPoint()] + "-All";
		} else {
			return scoreDescription[playerOne.getScoredPoint()] + "-" + scoreDescription[playerTwo.getScoredPoint()];
		}
	}
}
