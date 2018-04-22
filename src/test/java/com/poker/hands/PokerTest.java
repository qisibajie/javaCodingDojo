package com.poker.hands;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PokerTest {

    @Test
    public void should_return_play1_when_battle_given_greater_play1(){
        //given
        Poker play1 = new Poker("play1", "String 1");
        Poker play2 = new Poker("play12", "String 2");
        //when
        String winner = play1.battle(play2);
        //then
        assertThat(winner, is("play1"));
    }
}
