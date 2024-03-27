package execution1_25;

import java.util.Scanner;

import process1_25.status;

public class execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//コンソール入力欄を作る
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		// 入力内容を取得してコンソールに出力
		System.out.println("こんにちは「"+ name +"」さん");
		System.out.println("ステータス");
		// ステータス欄を出力
		new status("HP");
		new status("MP");
		new status("攻撃力");
		new status("素早さ");
		new status("防御力");
		
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
		
		//スキャナを閉じる
		scan.close();

	}

}