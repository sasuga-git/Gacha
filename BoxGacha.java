package ac.jp.hal;

public class BoxGacha extends Gacha {

	@Override
	int setPoint() {
		return 20;
	}

	@Override
	int setCardSum() {
		return 5;
	}

	@Override
	String setGachaName() {
		return "<h1>ボックスガチャ</h1>";
	}

}
