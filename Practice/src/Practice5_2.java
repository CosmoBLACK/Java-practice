
public class Practice5_2 {
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	public static void main(String[] args) {
		String title = "お知らせ";
		String address = "test@test";
		String text = "週末にお出かけしませんか？";
		email(title, address, text);
	}
}
