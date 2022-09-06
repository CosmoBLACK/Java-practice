
public class FizzBuzz {
	/*
	 * 1から順番に数を表示する。
	 * その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、両方で割り切れるなら"FizzBuzz"と表示する
	 */
	public static void main(String[] args) {
		//変数の初期化
		//ループカウンタ、順番に表示される数
		int i = 0;
		//繰り返し最大数（条件式で使う）、変数の初期化
		int loopCount = 100;
		//3の倍数、変数の初期化、for文内でiを割る数を呼び出すための変数
		int numFizz = 3;
		//5の倍数、変数の初期化、for文内でiを割る数を呼び出すための変数
		int numBuzz = 5;
		//Fizz文字列、変数の初期化、iが3で割り切れる場合の結果を呼び出すための変数
		String strFizz = "Fizz";
		//Buzz文字列、変数の初期化、iが5で割り切れる場合の結果を呼び出すための変数
		String strBuzz = "Buzz";
		
		for (i = 1; i <= loopCount; i++) {//変数の初期値の上書き、条件式、変数の値を1ずつ増やす更新の記述をする
			if (i % (numFizz * numBuzz) == 0) {//iが3や5で割り切れる場合、つまりiが3と5の最小公倍数の15で割り切れる場合
				System.out.println(strFizz + strBuzz);//Fizz + Buzz、つまりFizzBuzzを表示
			} else if (i % numFizz == 0) {//iが3で割り切れる場合
				System.out.println(strFizz);//Fizzを表示
			} else if (i % numBuzz == 0) {//iが5で割り切れる場合
				System.out.println(strBuzz);//Buzzを表示
			} else {
				System.out.println(i);//iがどの数でも割り切れない場合、数をそのまま表示
			}
		}
	}
}
