package ac.jp.hal;

public class Card {

	private int    num;
	private String name;
	private String rea;

	public Card(int num,String name,String rea){

		this.num  = num;
		this.name = name;
		this.rea  = rea;
	}

	public Card() {}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getRea() {
		return rea;
	}


}
