package com.tdd.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	TennisGame tennisGame;

	@Before
	public void initialize() {
		tennisGame = new TennisGame();
	}

	@Test
	public void playerScoreShouldBeZeroBeforeGameStarts() {

		assertThat(tennisGame.getPlayerOneScoredPoint(), CoreMatchers.is(0));
	}

	@Test
	public void firstPlayerNameShouldBeInitializedAsPlayerOneWhenGameStarts() {

		assertThat(tennisGame.getPlayerOneName(), CoreMatchers.is("Player One"));

	}

	@Test
	public void secondPlayerNameShouldBeInitializedAsPlayerTwoWhenGameStarts() {

		assertThat(tennisGame.getPlayerTwoName(), CoreMatchers.is("Player Two"));

	}

}
