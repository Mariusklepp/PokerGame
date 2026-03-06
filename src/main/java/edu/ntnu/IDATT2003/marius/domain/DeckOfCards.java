package edu.ntnu.IDATT2003.marius.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private final List<PlayingCard> cards;
    private Random random;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
        for (char c : suit) {
            for (int j = 1; j < 14; j++) {
                PlayingCard card = new PlayingCard(c, j);
                cards.add(card);
            }
        }
    }

    public Collection<PlayingCard> dealHand(int n) {
        if (n < 1 || n > 52) {
            throw new IllegalArgumentException("The number of cards dealt to a hand must be between 1 and 52.");
        }

        List<PlayingCard> deck = new ArrayList<>(cards);
        Collection<PlayingCard> hand = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            PlayingCard randomCard = deck.get(random.nextInt(52 - i));
            hand.add(randomCard);
            deck.remove(randomCard);
        }
        return hand;
    }
}
