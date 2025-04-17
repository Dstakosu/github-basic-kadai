package kadai_015;

// 車クラス
public class CarExec_Chapter15 {
	// フィールド（内部データ）
	private int gear = 1;
	private int speed = 10; // 時速（km）
	
	public void gearChange( int afterGear ) {
		// ギアの値により速度を変える
		
		// コンストラクタ（初期化処理）
		this.gear = afterGear;
		
		/* ========================================================
		 * if文で分岐処理を行う
		 * ギア値が2以上　かつ　5以下ならば、ギア値 ＊ 初期値スピード
		 * それ以外は初期値（10）なのでelse不要
		 * なお、今回はギア値1以下は考慮しない（車が動いている想定なので）
		 * ======================================================== */
		if (this.gear >= 2 && this.gear <= 5) {
			this.speed = this.gear * 10;
		}
	}
	
	public void run() {
		// ギアチェンジ後の速度を表示する
		System.out.println("現在のギアは「" + this.gear + "」です。" );
		System.out.println("現在のスピードは「時速" + this.speed + "km」です。" );
	}
}
