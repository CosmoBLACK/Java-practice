
public class If02 {
	public static void main(String[] args) {
		int number = 7;
		// if文：
		// numberが5未満の場合、ブロックの処理を実行
		if (number < 5) {
			System.out.println(number + "は5未満です");
		// else-if文：
		// 前のif文、-の条件式の評価が全てflaseで、
		// numberが10未満の場合、ブロックの処理を実行
		} else if (number < 10) {
			System.out.println(number + "は5以上、10未満です");
		// else-if文：
		// 前の条件式の評価が全てflaseで、numberが15未満の場合、ブロックの処理を実行
		} else if (number < 15) {
			System.out.println(number + "は10以上、15未満です");
		// else文：
		// 前の条件式の評価が全てflaseの場合、ブロックの処理を実行
		} else {
			System.out.println(number + "は15未満でないです");
		}
	}
}
