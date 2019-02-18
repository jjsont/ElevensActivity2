/**
 * This is a class that tests the Deck class.
 */

//Author: Jason Tan and Ben Wu
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		String[] ranks= {"J", "Q", "K", "A"};
		String[] suits= {"Clubs", "Diamond", "Heart", "Spades"};
		int[] values= {11,12,13,1};

		Deck one= new Deck(ranks, suits, values);
		one.deal();
		one.deal();

		Deck two= new Deck(ranks, suits, values);
		two.deal();

		Deck three = new Deck(ranks, suits, values);
		three.deal();
		three.deal();
		three.deal();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}

