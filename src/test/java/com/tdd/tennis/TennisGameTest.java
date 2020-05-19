package com.tdd.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TennisGameTest {

	@Test
	public void playerScoreShouldBeZeroBeforeGameStarts() {

		TennisGame tennisGame = new TennisGame();

		assertThat(tennisGame.getPlayerOneScoredPoint(), CoreMatchers.is(0));
	}

	@Test
	public void firstPlayerNameShouldBeInitializedAsPlayerOneWhenGameStarts() {
		TennisGame tennisGame = new TennisGame();

		assertThat(tennisGame.getPlayerOneName(), CoreMatchers.is("Player One"));

	}

}
