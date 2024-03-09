package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問1
		// コンソールに入力欄を作る
		Scanner scan = new Scanner(System.in);
		// 入力を読み取る
		String userName = scan.nextLine();
		// 読み取った文字数を数える
		int nameNum = userName.length();
		// 読み取った情報を元にコンソールに出力
		if(nameNum > 10) {
			// 10文字以上の入力があった場合の処理
			System.out.println("名前を10文字以内にしてください");
		}else if(userName.isEmpty()){
			// 入力がなかった場合の処理
			System.out.println("名前を入力してください");
		}else {
			// 正しく入力された場合の処理
			System.out.println("ユーザー名「"+userName+"」を登録しました");
		}
		
		// 問2
		// 入力を読み取る
		String userName2 = scan.nextLine();
		// 読み取った文字数を数える
		int nameNum2 = userName2.length();
		// 読み取った情報を元にコンソールに出力
		if(userName2.matches("^[A-Za-z0-9]+$")==false) {
			// 半角英数字以外の入力があった場合の処理
			System.out.println("半角英数字のみで名前を入力してください");
		}else if(nameNum2 > 10) {
			// 10文字以上の入力があった場合の処理
			System.out.println("名前を10文字以内にしてください");
		}else if(userName2.isEmpty()){
			// 入力がなかった場合の処理
			System.out.println("名前を入力してください");
		}else {
			// 正しく入力された場合の処理
			System.out.println("ユーザー名「"+userName2+"」を登録しました");
		}
		
		// 問3
		
		// 自分のじゃんけんの手
		String myResult[] = new String[3];
		myResult[0]= "グー";
		myResult[1]="チョキ";
		myResult[2]="パー";
		
		// 相手のじゃんけんの手
		String youResult[] = new String[3];
		youResult[0]="グー";
		youResult[1]="チョキ";
		youResult[2]="パー";
		
		// 勝負回数の初期化
		int i = 0;
		
		// じゃんけんゲームの処理
		while(true){
			// 入力を読み取る
			String userName3 = scan.nextLine();
			// 入力した文字数を数える
			int nameNum3 = userName3.length();
			
			// ユーザーネームの入力を判定する処理
			if(userName3.isEmpty()) {
				// 空欄の場合
				System.out.println("名前を入力してください");
				continue;
			}else if(nameNum3 > 10) {
				// 10文字以上の入力があった場合
				System.out.println("名前を10文字以内にしてください");
				continue;
			}else if(userName3.matches("^[A-Za-z0-9]+$")==false){
				// 半角英数字以外で入力した場合
				System.out.println("半角英数字のみで名前を入力してください");
				continue;
			}else {
				// 正しく入力された場合
				System.out.println("ユーザー名「"+userName3+"」を登録しました");
			}
			// ランダムな0〜2の数字を作る処理
			Random rdm1 = new Random();
			Random rdm2 = new Random();
			
			// 乱数を取得する処理
			int myInt = rdm1.nextInt(3);
			int youInt = rdm2.nextInt(3);
			
			// ランダムなじゃんけんの手を出す
			System.out.println(userName3+"の手は「"+ myResult[myInt] +"」");
			System.out.println("相手の手は「" + youResult[youInt] + "」");
			
			// コンソールにじゃんけんの判定を出す処理
			if((myInt==0&&youInt==1)||(myInt==1&&youInt==2)||(myInt==2&&youInt==0)) {
				// じゃんけんに勝った場合
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
			}else if(myInt==1&&youInt==0) {
				// グーに負けた場合
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			}else if(myInt==2&&youInt==1) {
				// チョキに負けた場合
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思っていないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			}else if(myInt==0&&youInt==2) {
				// パーに負けた場合
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日までに考えといてください。");
				System.out.println("そしたら何か見えてくるはずです");
			}else {
				// あいこだった場合
				System.out.println("DRAW あいこ　もう一回しましょう！");
			}
			
			// 勝負の回数を加算する
			i++;
			
			// じゃんけんに勝った場合ループを抜け出す処理
			if((myInt==0&&youInt==1)||(myInt==1&&youInt==2)||(myInt==2&&youInt==0)) {
				break;
			}
		}
		// 勝つまでにかかった回数をコンソールに出す
		System.out.println("勝つまでにかかった合計回数は"+i+"回です");
		
		// スキャナーを閉じる
		scan.close();

	}

}
