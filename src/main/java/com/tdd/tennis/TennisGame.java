package com.tdd.tennis;

import com.tdd.tennis.model.Player;

public class TennisGame {

	private static final String WINS = " Wins";

	private static final int MIN_POINT_DIFF_FOR_WIN = 2;

	private static final int MIN_POINTS_TO_WIN = 4;

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
		if (isGameWonByAnyPlayer()) {
			return getLeadingPlayerName() + WINS;
		} else if (isScoresLevel()) {
			return scoreDescription[playerOne.getScoredPoint()] + ALL;
		} else {
			return scoreDescription[playerOne.getScoredPoint()] + HYPHEN + scoreDescription[playerTwo.getScoredPoint()];
		}
	}

	private boolean isGameWonByAnyPlayer() {
		return (playerOne.getScoredPoint() >= MIN_POINTS_TO_WIN || playerTwo.getScoredPoint() >= MIN_POINTS_TO_WIN)
				&& (Math.abs(playerTwo.getScoredPoint() - playerOne.getScoredPoint()) >= MIN_POINT_DIFF_FOR_WIN);
	}

	private boolean isScoresLevel() {
		return playerOne.getScoredPoint() == playerTwo.getScoredPoint();
	}

	private String getLeadingPlayerName() {
		return (playerOne.getScoredPoint() > playerTwo.getScoredPoint()) ? playerOne.getPlayerName()
				: playerTwo.getPlayerName();
	}
}
