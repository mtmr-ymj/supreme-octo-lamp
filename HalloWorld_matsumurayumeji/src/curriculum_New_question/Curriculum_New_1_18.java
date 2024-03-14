package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	int[] arr;
	double avr;
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hallo(String str1,String str2,int num) {
		System.out.println(str1+" "+str2+" "+num);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multi(int num1,int num2) {
		System.out.println(num1 * num2);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void array(int[] arr) {
		// 引数として受け取った配列の数だけ処理を繰り返す
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multi(double dou1,double dou2) {
		System.out.println(dou1 + dou2);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public int[] ran(int n) {
		// 乱数を作る
		Random random = new Random();
		
		// 新しく配列を作成する
		arr = new int[n];
		
		// 引数の数だけ繰り返す
		for(int r=0;r<n;r++) {
			// 1〜100の乱数を作る
			int num = random.nextInt(100) +1;
			// 配列に作成した乱数を入れる
			arr[r]= num;
			// 出力する
			System.out.println(num);
		}
		// 作成した配列を返す
		return arr;
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public double avr() {
		// 合計の変数を作成する
		int sum = 0;
		
		// 作った配列を入れる
		int[] data = arr;
		
		// 配列の数だけ繰り返す
		for(int i=0;i<data.length;i++) {
			// 配列の中身を足していく
			sum += data[i];
		}
		// 平均値を計算して変数に入れる
		avr = sum/data.length;
		// 平均値を出力する
		System.out.println(avr);
		
		// 計算した平均値を返す
		return avr;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public boolean bo() {
		// 計算した平均値を入れる
		double d = avr;
		
		// 平均値が50以上だった場合
		if(d>=50) {
			// trueを返す
			return true;
		// 平均値がそれ以外だった場合
		}else {
			// falseを返す
			return false;
		}
	}

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// 引数の文字列と数字を順番に並べて出力するメソッド
		hallo("Hallo","JavaSE",11);
		
		// 入れた整数同志を乗算するメソッド
		multi(2,3);
		
		// 配列を作成する
		int[] num = {2,4};
		// 配列を引数として渡しコンソールに出力するメソッド
		array(num);
		
		// 入れた小数同士を足し算するメソッド
		multi(2.5,3.0);
		
		// 引数に入れた数だけランダムな値を作成し出力した後格納した数を返す値
		Curriculum_New_1_18 ran = new Curriculum_New_1_18();
		ran.ran(2);
		
		// ranのメソッドで格納した値を読み取りranで作成した数の平均値を出すメソッド
		ran.avr();
		
		// avrメソッドで出した平均値を読み取り50以上ならtrue、それ以外ならfalseを返すメソッド
		System.out.println(ran.bo());
	
	}
}