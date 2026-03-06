package domainTest;

import edu.ntnu.IDATT2003.marius.domain.PlayingCard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayingCardTest {

    @Test
    void playingCardConstructor_createsObject () {
        PlayingCard card = new PlayingCard('H', 1);
        assertEquals('H', card.getSuit());
        assertEquals(1, card.getFace());
    }

    @Test
    void playingcardConstructorThrows_whenSuitIsNotValid () {
       assertThrows(IllegalArgumentException.class, ()-> new PlayingCard('E', 2));
    }

    @Test
    void playingcardConstructorThrows_whenFaceIsNotValid () {
        assertThrows(IllegalArgumentException.class, ()-> new PlayingCard('H', 60));
    }

    @Test
    void getAsString_returnsCorrectString () {
        PlayingCard card = new PlayingCard('H', 1);
        assertEquals("H1", card.getAsString());
    }

    @Test
    void equals_returnsTrue_whenSameObject() {
        PlayingCard card = new PlayingCard('H', 5);

        assertTrue(card.equals(card));
    }

    @Test
    void equals_returnsTrue_whenCardsHaveSameSuitAndFace() {
        PlayingCard c1 = new PlayingCard('H', 5);
        PlayingCard c2 = new PlayingCard('H', 5);

        assertTrue(c1.equals(c2));
    }

    @Test
    void equals_isSymmetric() {
        PlayingCard c1 = new PlayingCard('H', 5);
        PlayingCard c2 = new PlayingCard('H', 5);

        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c1));
    }

    @Test
    void equals_returnsFalse_whenSuitIsDifferent() {
        PlayingCard c1 = new PlayingCard('H', 5);
        PlayingCard c2 = new PlayingCard('S', 5);

        assertFalse(c1.equals(c2));
    }

    @Test
    void equals_returnsFalse_whenFaceIsDifferent() {
        PlayingCard c1 = new PlayingCard('H', 5);
        PlayingCard c2 = new PlayingCard('H', 6);

        assertFalse(c1.equals(c2));
    }

    @Test
    void equals_returnsFalse_whenComparedWithNull() {
        PlayingCard card = new PlayingCard('H', 5);

        assertFalse(card.equals(null));
    }

    @Test
    void equals_returnsFalse_whenComparedWithDifferentType() {
        PlayingCard card = new PlayingCard('H', 5);

        assertFalse(card.equals("not a card"));
    }

    @Test
    void hashCode_returnsSameValue_whenCardsAreEqual() {
        PlayingCard c1 = new PlayingCard('H', 5);
        PlayingCard c2 = new PlayingCard('H', 5);

        assertEquals(c1.hashCode(), c2.hashCode());
    }

    @Test
    void hashCode_returnsSameValue_forSameObject() {
        PlayingCard card = new PlayingCard('H', 5);

        assertEquals(card.hashCode(), card.hashCode());
    }


}
