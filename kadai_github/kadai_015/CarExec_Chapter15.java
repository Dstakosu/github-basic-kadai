package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		
		// ギア値の変数を作成
		int gearValue = 3;
		
		// 車クラスのインスタンスを作成する
		Car_Chapter15 perHour = new Car_Chapter15();
		
		// 車クラスのgearChangeメソッドを実行する
		perHour.gearChange(gearValue);
		
		// 車クラスのrunメソッドを実行する
		perHour.run();
		
	}

}
