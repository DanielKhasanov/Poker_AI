public class Deck {
	private boolean facedown;
	private Card[] cardArray;

	public Deck(boolean facedown) {
		cardArray = new Card[53];

		for (int i = 1; i < 53; i++)  {
			cardArray[i - 1] = new Card(i, facedown);
		}
	}

	public static void main(String[] args) {
		Deck test = new Deck(true);
		for (int i = 0; i < 52; i ++) {
			test.cardArray[i].print();
		}
	}
}