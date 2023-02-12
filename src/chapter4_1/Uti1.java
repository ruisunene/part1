package chapter4_1;

/**ユーティリティクラス
 *<p>
 *便利なメソッドを集めたクラスです<br>
 *これからも色々なメソッドを追加していく予定です。
 *
 *version 1.0
 * @author horikawaryouma
 *
 */

public class Uti1 {
	/**
	 * 円の面積を計算する
	 * 
	 * @param hankei 円の半径
	 * @return             円の面積
	 */

	public static double menseki(double hankei) {
		double s  = Math.pow(hankei, 2) * Math.PI;
		return s;
	}
	
	/**
	 * 四角形の面積を計算する
	 * 
	 * @param height　高さ
	 * @param width　幅
	 * @return　四角形の面積
	 */
	
	public static double menseki(double height, double width) {
		double s = height * width;
		return s;
	}
}
