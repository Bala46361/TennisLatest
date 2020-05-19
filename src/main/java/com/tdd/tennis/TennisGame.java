package com.tdd.tennis;

import com.tdd.tennis.model.Player;

public class TennisGame {

	private static final String HYPHEN = "-";

	private static final String ALL = "-All";

	private static final String[] scoreDescription = { "Love", "Fifteen", "Thirty", "Forty" };

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
		if ((playerOne.getScoredPoint() >= 4 || playerTwo.getScoredPoint() >= 4)
				&& (Math.abs(playerTwo.getScoredPoint() - playerOne.getScoredPoint()) >= 2)) {
			return getLeadingPlayerName() + " Wins";
		} else if (isScoresLevel()) {
			return scoreDescription[playerOne.getScoredPoint()] + ALL;
		} else {
			return scoreDescription[playerOne.getScoredPoint()] + HYPHEN + scoreDescription[playerTwo.getScoredPoint()];
		}
	}

	private boolean isScoresLevel() {
		return playerOne.getScoredPoint() == playerTwo.getScoredPoint();
	}

	private String getLeadingPlayerName() {
		return (playerOne.getScoredPoint() > playerTwo.getScoredPoint()) ? playerOne.getPlayerName()
				: playerTwo.getPlayerName();
	}
}
