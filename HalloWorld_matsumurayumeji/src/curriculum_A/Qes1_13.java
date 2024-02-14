package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問１
		// byte型の変数を宣言
		byte by;
		// 短整数型の変数を宣言
		short sh;
		// 整数型の変数を宣言
		int in;
		// 長整数型の変数を宣言
		long lo;
		// 単精度浮動小数点数型の変数を宣言
		float fl;
		// 倍精度浮動小数点数型の変数を宣言
		double dou;
		// 文字型の変数を宣言
		char ch;
		// 文字列型の変数を宣言
		String st;
		// ブーリアン型の変数を宣言
		boolean bo;
		
		// 問２
		// byte型の変数の初期値を設定
		by = 0;
		// 短整数型の変数の初期値を設定
		sh = 0;
		// 整数型の変数の初期値を設定
		in = 0;
		//　長整数型の変数の初期値を設定
		lo = 0;
		// 単精度浮動小数点数型の変数の初期値を設定
		fl = 0.0F;
		// 倍精度浮動小数点数型の変数の初期値を設定
		dou = 0.0;
		// 文字型の変数の初期値を設定
		ch = '\u0000';
		// 文字列型の変数の初期値を設定
		st = null;
		// ブーリアン型の変数の初期値を設定
		bo = false;
		
		// 問３
		// byte型の変数に値を代入
		by = 10;
		// 短整数型の変数に値を代入
		sh = 100;
		// 整数型の変数に値を代入
		in = 1000;
		// 長整数型の変数に値を代入
		lo = 10000;
		// 単精度浮動小数点数型の変数に値を代入
		fl = 9.5F;
		// 倍精度浮動小数点数型の変数に値を代入
		dou = 10.5;
		// 文字型の変数に値を代入
		ch = 'a';
		// 文字列型の変数に値を代入
		st = "ハロー";
		// ブーリアン型の変数に値を代入
		bo = true;
		
		// 問４
		// 11110とコンソールに出力
		System.out.println(by + sh + in + lo);
		// 20とコンソールに出力
		System.out.println(by*2);
		// aハローtrueとコンソールに出力
		System.out.println(ch + st + bo);
		// 11130.0とコンソールに出力
		System.out.println(by + sh + in + lo + fl + dou);
		// 10000000000とコンソールに出力
		System.out.println(by*sh*in*lo);
		// 0.105とコンソールに出力
		System.out.println(dou/sh);
		// -90とコンソールに出力
		System.out.println(by-sh);
		
		// 問５
		 /*
		  * 以下のプログラムを「ハローJAVA43」と表示されるように修正する
		  * String num="20";
		  * int num1=23;
		  * System.out.println("ハローJAVA"+(num+num1));
		  */
		// 文字列型を整数型に修正
		int num=20;
		// 整数型の変数
		int num1=23;
		// コンソールに文字列を出力
		System.out.println("ハローJAVA"+(num+num1));
		
		// 問６
		// 名前を代入
		String name = "山田太郎";
		// 年齢を代入
		byte age = 18;
		// 身長を代入
		double height = 170.5;
		// 体重を代入
		double weight = 62.2;
		// 好きな食べ物を代入
		String food = "寿司";
		
		// コンソールに自己紹介文を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		// 問７
		// BMIを計算する
		double BMI = (weight/((height/100)*(height/100)));
		// BMIを少数第一位で四捨五入してコンソールに出力
		System.out.println("BMIは"+((double)Math.round(BMI*10)/10)+"です");
		
		// 問８
		// 年齢を再代入
		name = "鈴木一郎";
		// 年齢を再代入
		age = 24;
		// 身長を再代入
		height = 168.5;
		// 体重を再代入
		weight = 64.2;
		// 好きな食べ物を再代入
		food = "オムライス";
		// BMIを計算する
		BMI = (weight/((height/100)*(height/100)));
		
		// 再代入した値で自己紹介文を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+((double)Math.round(BMI*10)/10)+"です");
		
		// 問９
		// 年齢を加算で自己代入
		age += 24;
		// 身長を加算で自己代入
		height += 168.5;
		// 体重を加算で自己代入
		weight += 64.2;
		// BMIを再計算する
		BMI = (weight/((height/100)*(height/100)));
		
		// 再代入した値で自己紹介文を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+((double)Math.round(BMI*100)/100)+"です");
		
		// 問10
		// 問８で使った年齢に直す
		age = 24;
		// 年齢が25歳以上でtrueを返す変数
		boolean result = (age>=25);
		// 真偽値をコンソールに出力
		System.out.println(result);
		
		// 問11
		// 年齢を文字列型に変換
		String sage = String.valueOf(age);
		// 身長を文字列型に変換
		String sheight = String.valueOf(height);
		// 体重を文字列型に変換
		String sweight = String.valueOf(weight);
		
		// 文字列型に変換した年齢身長体重を繋げてコンソールに出力
		System.out.println(sage+sheight+sweight);
		
		// 問12
		// 文字列型に変換した年齢を整数型に変換
		int iage = Integer.valueOf(sage);
		// 文字列型に変換した身長を小数点数型に変換
		double dheight = Double.valueOf(sheight);
		// 小数点数型に変換したものを整数型に変換
		int iheight = (int)dheight;
		
		// 整数型に変換した値をコンソールに出力
		System.out.println(iage);
		System.out.println(iheight);
		
		// 問13
		// 年齢が25歳以上もしくは身長が160センチ以上でtrueを返す変数
		result = (iage >= 25) || (iheight >= 160);
		// 真偽をコンソールに出力
		System.out.println(result);

	}

}
