
public class Sum_1_100 {//クラス部分
	public static void main(String[] args) {//メソッド部分
		//以下は処理部分
		int sum = 0;//変数の初期化
		//繰り返し文、numberが100の場合まで繰り返す
		for (int number = 1; number <= 100; number++) {//変数の初期化、条件式、変数の値を1ずつ増やす更新の記述をする
			sum += number;//sumの値にnumberの値を足してsumに代入する
		}
		
		System.out.println("1から100までの整数をすべて足した結果は、" + sum + "である");
	}
}

/* ---- while文の場合 ----

public class ALH_Task1_1 {
	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		
		while(number <= 100) {
			sum += number;
			number++;
		}
		
		System.out.println("1から100までの整数をすべて足した結果は、" + sum + "である");
	}
}

*/