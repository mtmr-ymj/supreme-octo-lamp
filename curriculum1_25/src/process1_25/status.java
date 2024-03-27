package process1_25;

import java.util.Optional;
import java.util.Random;

// クラスを継承したサブクラス
public class status extends process{
	
	// サブクラスのコンストラクタ
	public status(String statusName) {
		// ステータスの数値をランダムに出力
		Random num = new Random();
		int statusNum = num.nextInt(1000)+1;
		
		// ステータス名を引数からセットする
		setStatusName(statusName);
		// セットしたものを数値と合わせて文字列にする
		String out = getStatusName() +":"+ statusNum;
		// nullチェック
		Optional<String> check = Optional.ofNullable(out);
		out = check.orElse("null");
		
		// nullチェックした数値をコンソールに出力
		System.out.println(out);
	}

}
