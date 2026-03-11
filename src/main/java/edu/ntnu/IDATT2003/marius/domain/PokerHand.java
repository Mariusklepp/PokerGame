package edu.ntnu.IDATT2003.marius.domain;

import java.util.List;
import java.util.stream.Collectors;

public abstract class PokerHand {

    private List<PlayingCard> pokerHand;


    public PokerHand (List<PlayingCard> hand) {
        this.pokerHand = hand;
    }

    public int sumOfHand () {
        return pokerHand.stream()
                .mapToInt(PlayingCard::getFace)
                .sum();
    }

    public String heartsInHand () {
        return pokerHand.stream().
                filter(playingCard -> playingCard.getSuit() == 'H')
                .map(playingCard -> playingCard.getSuit() + "" + playingCard.getFace())
                .collect(Collectors.joining(" "));
    }

    public boolean hasQueenOfSpades () {
        return pokerHand.stream().anyMatch(playingCard ->
                playingCard.getSuit() == 'S' &&
                playingCard.getFace() == 12);
    }

    public boolean isFlush() {
        return pokerHand.stream().
                map(PlayingCard::getSuit)
                .distinct()
                .count() == 1;
    }

}

