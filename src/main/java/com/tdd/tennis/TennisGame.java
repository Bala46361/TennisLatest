package com.tdd.tennis;

import com.tdd.tennis.model.Player;

public class TennisGame {

	private static final String HYPHEN = "-";

	private static final String ALL = "-All";

	private static final String[] scoreDescription = { "Love", "Fifteen", "Thirty" };

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

		if (isScoresLevel()) {
			return scoreDescription[playerOne.getScoredPoint()] + ALL;
		} else {
			return scoreDescription[playerOne.getScoredPoint()] + HYPHEN + scoreDescription[playerTwo.getScoredPoint()];
		}
	}

	private boolean isScoresLevel() {
		return playerOne.getScoredPoint() == playerTwo.getScoredPoint();
	}
}
