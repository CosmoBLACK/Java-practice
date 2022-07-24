package exception;

public class Exception03 {
	public static void main(String[] args) {
		try {
			Exception03.division(100, 0); // divisionメソッドを呼び出し
		} catch (ArithmeticException e) { // ArithmeticExceptionクラスの例外が発生した場合の例外処理
			System.out.println("ArithmeticException例外が発生"); // 例外クラスが一致しないので、例外処理が実行されない
		} catch (IllegalArgumentException e) { // IllegalArgumentExceptionクラスの例外が発生した場合の例外処理		
			System.out.println("IllegalArgumentException例外が発生"); // 例外処理が実行される
			throw e; // キャッチした例外インスタンスをスロー
		}
		System.out.println("プログラム終了"); // finallyブロックでないので処理が実行されない
	}
	
	public static void division(int a, int b) {
		System.out.println(a + "÷" + b + "は？");
		if (b == 0) {
			// 割り算で例外が発生するので、意図的にIllegalArgumentException例外をスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}
