package ac.jp.hal;

import java.util.Random;

public abstract class  Gacha {

	int     Point;
	int     CardSum;
	String  gachaName;
	CardSet cards = new CardSet();
	Card    card  = new Card();

	public Gacha(){
		this.Point    = setPoint();
		this.CardSum  = setCardSum();
		this.gachaName= setGachaName();
	}

	public String chooseCards(){

		Card[]  cardSet = new Card[CardSum];
		Random  ra      = new Random();
		String  html    = "";

		for(int i=0;i <CardSum;i++){
			int m = ra.nextInt(cards.getCardsum());

			System.out.println(m+"ランダム");

			cardSet[i] = cards.get(m);

			html=html+cardSet[i].getNum()+":"+cardSet[i].getName()+":"+cardSet[i].getRea()+"<br>";
		}
		return html;
	}

	abstract int    setPoint();
	abstract int    setCardSum();
	abstract String setGachaName();


}
