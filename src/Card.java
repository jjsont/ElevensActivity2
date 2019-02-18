/**
 * Created by Teacher on 1/7/2019.
 */
public class Card {

    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.suit= cardSuit;
        this.rank= cardRank;
        this.pointValue= cardPointValue;
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    public int PointValue() {
        return pointValue;
    }

    public boolean matches(Card otherCard) {
        return otherCard.rank().equals(rank) && otherCard.suit().equals(suit);
    }

    public String toString() {
        return rank + "of " + suit + "(point value= " + pointValue + ")";
    }
}
