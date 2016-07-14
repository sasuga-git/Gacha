package ac.jp.hal;

public class NormalGacha extends Gacha {

	@Override
	int setPoint() {
		return  5;
	}

	@Override
	int setCardSum() {
		return  1;
	}

	@Override
	String setGachaName() {

		return "<h1>ノーマルガチャ</h1>";
	}

}
