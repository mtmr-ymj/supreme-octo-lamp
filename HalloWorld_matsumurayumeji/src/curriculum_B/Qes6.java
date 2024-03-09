package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 入力欄を作る
		Scanner scan = new Scanner(System.in);
		// 区切りを「、」にする処理
		scan.useDelimiter("、");
		
		// 入力が続く間は繰り返す処理
		while(scan.hasNext()) {
			
			// 区切りまでの入力を読み取る
			String result = scan.next();
			
			// 入力結果によって分岐する処理
			switch(result) {
			
			// 入力が「パソコン」の場合
			case "パソコン":
				
				// ランダムな0~11の数字を生成する処理
				Random pc = new Random();
				int p = pc.nextInt(12);
				
				// 生成した乱数で残り台数を表示
				System.out.println("パソコンの残り台数は"+p+"台です");
				
				// 他の処理を飛ばし繰り返し
				continue;
				
			// 入力が「冷蔵庫」の場合
			case "冷蔵庫":
				
				// ランダムな1〜11の数字を生成する処理
				Random fz = new Random();
				int f = fz.nextInt(12);
				
				// 生成した乱数で残り台数を表示
				System.out.println("冷蔵庫の残り台数は"+f+"台です");
				
				// 他の処理を飛ばし繰り返し
				continue;
				
			// 入力が「扇風機」の場合
			case "扇風機":
				
				// ランダムな１〜11の数字を生成する処理
				Random se = new Random();
				int s = se.nextInt(12);
				
				// 生成した乱数で残り台数を表示
				System.out.println("扇風機の残り台数は"+s+"台です");
				
				// 他の処理を飛ばし繰り返し
				continue;
				
			// 入力が「洗濯機」の場合
			case "洗濯機":
				
				// ランダムな１〜11の数字を生成する処理
				Random ra = new Random();
				int r = ra.nextInt(12);
				
				// 生成した乱数で残り台数を表示
				System.out.println("洗濯機の残り台数は"+r+"台です");
				
				// 他の処理を飛ばし繰り返し
				continue;
				
			// 入力が「加湿器」の場合
			case "加湿器":
				
				// ランダムな１〜11の数字を生成する処理
				Random hu = new Random();
				int h = hu.nextInt(12);
				
				// 生成した乱数で残り台数を表示
				System.out.println("加湿器の残り台数は"+h+"台です");
				
				// 他の処理を飛ばし繰り返し
				continue;
				
			// 入力が「テレビ」「ディスプレイ」の場合
			case "テレビ":
			case "ディスプレイ":
				
				// ランダムな１〜11の数字を生成する処理
				Random tv = new Random();
				int t = tv.nextInt(12);
				
				// 入力がテレビだった場合とそうでない場合の条件分岐処理
				String td = result.equals("テレビ") ? "テレビの残り台数は"+t+"台です":"ディスプレイの残り台数は"+(11-t)+"台です";
				// 条件分岐処理の結果を出力
				System.out.println(td);
				
				// 他の処理を飛ばし繰り返し
				continue;				
				
			// 規定の入力以外が入力された場合
			default:
				
				// 文章を出力
				System.out.println("『"+result+"』は指定の商品ではありません");
				
				// 他の処理を飛ばし繰り返し処理
				continue;
			
			}
		}
		// スキャナを閉じる
		scan.close();

	}

}
