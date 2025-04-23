package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        this.dictionary = new HashMap<>();
        // コンストラクタ
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }
    
    // 判別
    public void discrimination(String word) {
    	// dictionaryにキーが存在するか確認
    	if (dictionary.containsKey(word)) { // キーがある時
    		System.out.println(word + "の意味は" + dictionary.get(word));
        } else { // キーがない時
        	System.out.println(word + "は辞書に存在しません");
        }
    	
	}
    
}