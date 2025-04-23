package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		// 辞書クラスのインスタンスを作成する
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語を配列にセットする
        String[] wordToSearchArray = {"apple", "banana", "grape", "orange"};
        
        // 辞書を調べるメソッドを引数指定で呼び出す
        for( String word : wordToSearchArray ) {
        	dictionary.discrimination(word);
        }
     
	}

}
