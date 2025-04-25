package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// 配列管理
	String[] handKeyArray = {"r", "s", "p"};
	String[] actionArray = {"グー", "チョキ", "パー"};
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice(Scanner scanner) {
		
		String inputHands= ""; // 自分の手
		
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            
            inputHands = scanner.nextLine();
            
            if (inputHands.equals(handKeyArray[0]) || inputHands.equals(handKeyArray[1]) || inputHands.equals(handKeyArray[2])) {
            	// while文から抜ける
            	break;
            } else {
            	// エラーメッセージを出力。再ループ
                System.out.println("エラー：不正な入力値です。じゃんけんの手を再度入力してください");
            }
		}
		return inputHands;
	}
	
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		
		// 相手の行動を指定
        String opponentHand = handKeyArray[(int) Math.floor(Math.random() * 3)];
        return opponentHand;
    }
	
	
	// じゃんけんを行うメソッド
	public void playGame() {
        try (Scanner scanner = new Scanner(System.in)) {
            
        	// それぞれの手をメソッドから取得
            String myHand = getMyChoice(scanner);
            String opponentHand = getRandom();

            // じゃんけんの手をコレクション指定
            HashMap<String, String> handList = new HashMap<String, String>();
            for (int i = 0; i < handKeyArray.length; i++) {
            	handList.put(handKeyArray[i], actionArray[i]);
            }

            // コンソール出力
            System.out.println("自分の手は" + handList.get(myHand) + "です");
            System.out.println("対戦相手の手は" + handList.get(opponentHand) + "です");

            // じゃんけん結果の出力
            if (myHand.equals(opponentHand)) { // trueならあいこ
                System.out.println("あいこです");
            } else if (myHand.equals(handKeyArray[0]) && opponentHand.equals(handKeyArray[1])) { // 自分がグー、相手がチョキ
            	System.out.println("自分の勝ちです");
            } else if (myHand.equals(handKeyArray[1]) && opponentHand.equals(handKeyArray[2])) { // 自分がチョキ、相手がパー
            	System.out.println("自分の勝ちです");
            } else if (myHand.equals(handKeyArray[2]) && opponentHand.equals(handKeyArray[0])) { // 自分がパー、相手がグー
            	System.out.println("自分の勝ちです");
            } else { // それ以外は負け
            	System.out.println("自分の負けです");
			}
        }
    }
}
