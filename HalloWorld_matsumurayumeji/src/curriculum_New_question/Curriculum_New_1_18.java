package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
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
	public static int[] ran(int n) {
		Random ran = new Random();
		int[] arr=new int[n];

		for(int r=0;r<n;r++) {
			int num = ran.nextInt(100) +1;
			arr[r]= num;
			System.out.println(num);
		}
		return arr;
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double avr(int num) {
		int sum = 0;
		int data[] = ran(num);
		for(int i=0;i<num;i++) {
			sum += data[i];
		}
		double avr = sum/data.length;
		System.out.println(avr);
		return avr;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean bo(int num) {
		double d = avr(num);
		if(d>=50) {
			return true;
		}else {
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
		ran(2);
		
		// ranのメソッドで格納した値を読み取りranで作成した数の平均値を出すメソッド
		avr(2);
		
		// avrメソッド出出した平均値を読み取り50以上ならtrue、それ以外ならfalseを返すメソッド
		System.out.println(bo(2));
	
	}
}