package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// インスタンス化
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.setGivenName();
        taro.execIntroduce();
        System.out.println(); // 改行空白
		
        // インスタンス化
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.setGivenName();
        ichiro.execIntroduce();
        System.out.println(); // 改行空白
        
        // インスタンス化
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.setGivenName();
        hanako.execIntroduce();
        System.out.println(); // 改行空白
        
	}

}
