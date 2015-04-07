public class Card {
	private int value_int;
	private String value_name;
	private int suit_int;
	private String suit_name;
	private boolean facedown;
	private int index;


	public Card(int index, boolean facedown) {
		this.index = index;
		this.facedown = facedown;
		this.suit_int = index % 4; //extracts the suit from index
		this.value_int = index % 13; //extracts the number from index, 1 is Ace


		if (this.suit_int == 1) {
			this.suit_name = "Hearts";
		}
		
		else if (this.suit_int == 2) {
			this.suit_name = "Diamonds";
		}

		else if (this.suit_int == 3) {
			this.suit_name = "Spades";
		}

		else {
			this.suit_name = "Clubs";
		}


		if (this.value_int == 1) {
			this.value_name = "Ace";
		}
		
		else if (this.value_int == 2) {
			this.value_name = "Two";
		}

		else if (this.value_int == 3) {
			this.value_name = "Three";
		}

		else if (this.value_int == 4) {
			this.value_name = "Four";
		}

		else if (this.value_int == 5) {
			this.value_name = "Five";
		}

		else if (this.value_int == 6) {
			this.value_name = "Six";
		}

		else if (this.value_int == 7) {
			this.value_name = "Seven";
		}

		else if (this.value_int == 8) {
			this.value_name = "Eight";
		}

		else if (this.value_int == 9) {
			this.value_name = "Nine";
		}

		else if (this.value_int == 10) {
			this.value_name = "Ten";
		}

		else if (this.value_int == 11) {
			this.value_name = "Jack";
		}

		else if (this.value_int == 12) {
			this.value_name = "Queen";
		}

		else {
			this.value_name = "King";
		}	
	}

	public void print() {
		System.out.print(this.value_name);
		System.out.print(" of ");
		System.out.println(this.suit_name);
	}
}