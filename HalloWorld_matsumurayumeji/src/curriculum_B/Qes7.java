package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 教科名の配列
		String sub[] = new String[4];
		sub[0]="英語";
		sub[1]="数学";
		sub[2]="理科";
		sub[3]="社会";
		
		
		// 生徒数を入力する
		System.out.print("生徒の人数を入力して下さい(2以上):");
		Scanner student = new Scanner(System.in);
		
		// 入力された人数を読み取る
		int stuNum = student.nextInt();
		
		// 改行する
		System.out.print("\n");
		
		// テストの教科ごとの点数を入れる多次元配列を作る
		double subScore[][]=new double[stuNum][sub.length];
		
		// 繰り返しを数える変数
		int i =0;
		
		// 生徒の数だけ繰り返す処理
		do	{
			
			// 繰り返しを数える変数
			int subNum=0;
			
			// 教科の数だけ繰り返す処理
			while(sub.length>subNum) {
				
				// 各教科の点数を入力する処理
				System.out.print((i+1)+"人目の『"+sub[subNum]+"』の点数を入力して下さい:");
				Scanner score = new Scanner(System.in);
				
				// 教科ごとの点数を多次元配列に入れる
				subScore[i][subNum] = Math.round((score.nextDouble())*100)/100;
				
				// 繰り返しの数を増やす
				subNum++;
			}
			// 繰り返しの数を増やす
			i++;
		}while(i<stuNum);
		
		// 生徒ごとの平均点を計算する処理
		for(int b=0;b<stuNum;b++) {
			
			// 生徒ごとの合計点を入れる変数
			double scoreSum=0;
			
			// 生徒ごとの教科の合計点を計算する処理
			for(int a=0;a<sub.length;a++) {
				// 教科数分一つづつ足していく
				scoreSum += subScore[b][a];
			}
			
			// 生徒ごとの平均点を計算して出力する
			System.out.println((b+1)+"人目の平均点は"+(scoreSum/sub.length)+"点です");
		}
		
		// 教科ごとの平均点を計算する処理
		for(int c=0;c<sub.length;c++) {
			
			// 教科ごとの合計点を入れる変数
			int subSum =0;
			
			// 教科ごとの合計点を計算する
			for(int d=0;d<stuNum;d++) {
				// 生徒数ぶん一つづつ足していく
				subSum += subScore[d][c];
			}
			
			// 教科ごとの平均点を計算して出力する
			System.out.println(sub[c]+"の平均点は"+(subSum/stuNum)+"点です");
		}

	}

}
