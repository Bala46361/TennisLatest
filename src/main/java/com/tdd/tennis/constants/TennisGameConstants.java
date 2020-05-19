package com.tdd.tennis.constants;

public class TennisGameConstants {

	public static final int POINT_DIFF_ADVANTAGE = 1;

	public static final String ADVANTAGE = " Advantage";

	public static final String DEUCE = "Deuce";

	public static final int MIN_POINTS_TO_DECIDE_DEUCE = 3;

	public static final String WINS = " Wins";

	public static final int MIN_POINTS_TO_WIN = 4;

	public static final String HYPHEN = "-";

	public static final String ALL = "-All";

	private TennisGameConstants() {
		throw new IllegalStateException("Utility class");
	}
}