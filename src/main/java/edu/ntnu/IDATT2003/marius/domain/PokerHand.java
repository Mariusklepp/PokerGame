package edu.ntnu.IDATT2003.marius.domain;

import java.util.Collection;
import java.util.List;

public abstract class PokerHand {

    private List<PlayingCard> pokerHand;


    public PokerHand (List<PlayingCard> hand) {
        this.pokerHand = hand;
    }

//    public void PossibleCombinations () {
//        () -> combinations.highcard;
//    }
}

