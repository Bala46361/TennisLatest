package com.tdd.tennis;

import com.tdd.tennis.model.Player;

public class TennisGame {

	private static final int POINT_DIFF_ADVANTAGE = 1;

	private static final String ADVANTAGE = " Advantage";

	private static final String DEUCE = "Deuce";

	private static final int MIN_POINTS_TO_DECIDE_DEUCE = 3;

	private static final String WINS = " Wins";

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

		String gameResult = "";

		if (isAnyPlayerEligibleForWinOrAdvantage()) {
			gameResult = isScoredPointsDifferenceEqualToOne() ? getEligiblePlayerResult(ADVANTAGE)
					: getEligiblePlayerResult(WINS);
		} else if (isScoresLevel()) {
			gameResult = isDeuce() ? DEUCE : scoreDescription[playerOne.getScoredPoint()] + ALL;
		} else {
			gameResult = scoreDescription[playerOne.getScoredPoint()] + HYPHEN
					+ scoreDescription[playerTwo.getScoredPoint()];
		}

		return gameResult;
	}

	private boolean isScoredPointsDifferenceEqualToOne() {
		return Math.abs(playerOne.getScoredPoint() - playerTwo.getScoredPoint()) == POINT_DIFF_ADVANTAGE;
	}

	private boolean isDeuce() {
		return playerOne.getScoredPoint() >= MIN_POINTS_TO_DECIDE_DEUCE;
	}

	private boolean isAnyPlayerEligibleForWinOrAdvantage() {
		return playerOne.getScoredPoint() >= MIN_POINTS_TO_WIN || playerTwo.getScoredPoint() >= MIN_POINTS_TO_WIN;
	}

	private boolean isScoresLevel() {
		return playerOne.getScoredPoint() == playerTwo.getScoredPoint();
	}

	private String getLeadingPlayerName() {
		return (playerOne.getScoredPoint() > playerTwo.getScoredPoint()) ? playerOne.getPlayerName()
				: playerTwo.getPlayerName();
	}

	private String getEligiblePlayerResult(String result) {
		return getLeadingPlayerName() + result;
	}
}
