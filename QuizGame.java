package quizgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuizGame {

	public static void main(String[] args) {
		System.out.println("[1] アメリカの首都はどこですか？");
		System.out.println("[2] 1:ニューヨーク");
		System.out.println("[3] 2:ワシントン");
		System.out.println("[4] 3:ロサンゼルス");
		System.out.print("[5] 答えを番号で入力し、改行を押してください。=>");
		
		/* コンソールから入力を行うオブジェクト作成 */
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int answer = 0;
		String message = "間違いです。";
		/* 文字列をコンソールから入力し、数値に変換 */
		try {
			String buf = bufferedReader.readLine();
			answer = Integer.parseInt(buf);
		} catch (Exception exception) {
			answer = 0;
			message = "答えを番号で入力してください。";
		}
		if (answer == 2) {
			message = "正解です。";
		}
		System.out.println(message);

	}

}
