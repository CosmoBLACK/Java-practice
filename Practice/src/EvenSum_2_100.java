
public class EvenSum_2_100 {//クラス部分
	public static void main(String[] args) {//メソッド部分
		//以下は処理部分
		int evenSum = 0;//変数の初期化
		//繰り返し文、numberが100の場合まで繰り返す
		for (int number = 2; number <= 100; number++) {//変数の初期化、条件式、変数の値を1ずつ増やす更新の記述をする
			if (number % 2 == 0) {//numberが2で割り切れる場合、つまりnumberが偶数の場合
				evenSum += number;//evenSumの値にnumberの値を足してevenSumに代入する
			}
		}
		
		System.out.println("2から100までの偶数のみをすべて足した結果は、" + evenSum + "である");
	}
}

/* ---- while文の場合 ----

public class ALH_Task1_2 {
	public static void main(String[] args) {
		int evenSum = 0;
		int number = 2;
		
		while (number <= 100) {
			if (number % 2 == 0) {
				evenSum += number;
			}
			number++;
		}
		
		System.out.println("2から100までの偶数のみをすべて足した結果は、" + evenSum + "である");
	}
}

*/