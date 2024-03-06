package curriculum_B;

public class Qes5 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// かける数を増やしていく処理
		for(int i=1;i<10;i++) {
			
			// かけられる数を増やしていく処理
			for(int j=1;j<=20;j++) {
				// ０埋めをして３桁の整数でコンソールに表示
				System.out.print(String.format("%03d", j)+"*"+String.format("%03d",i)+"="+String.format("%03d", (i*j)));
				
				//　かけられる数が20になったら「||」を飛ばす処理
				if(j>=20) {
					continue;
				}
				
				// 計算式の間に「||」を表示する
				System.out.print("||");
			}
			
			// かける数を増やすときに改行する処理
			System.out.println();
		}

	}


}
