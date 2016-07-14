package ac.jp.hal;

public class CardSet {

	Card[] cards;
	int    CardSum = 7;

	public int getCardsum(){

		return CardSum;

	}

	public CardSet(){

		this.cards    = new Card[CardSum];
		this.cards[0] = new Card(1,"a","n");
		this.cards[1] = new Card(2,"b","n");
		this.cards[2] = new Card(3,"c","n");
		this.cards[3] = new Card(4,"d","a");
		this.cards[4] = new Card(5,"e","a");
		this.cards[5] = new Card(6,"f","s");
		this.cards[6] = new Card(7,"g","s");
	}

	public Card get(int i) {

		Card card = this.cards[i];

		return card;
	}




}
