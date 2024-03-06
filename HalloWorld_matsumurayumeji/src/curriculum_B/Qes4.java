package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// かけられる数を増やしていく処理
		for(int i=1;i<10;i++) {
			
			// かける数を増やしていく処理
			for(int j=1;j<10;j++) {
				
				// ０埋めをして２桁の整数でコンソールに表示
				System.out.print(String.format("%02d", i)+"*"+String.format("%02d",j)+"="+String.format("%02d", (i*j)));
				
				// かける数が10になったら「||」表示を飛ばす処理
				if(j>=9) {
					continue;
				}
				
				// 計算式の間に「||」を表示
				System.out.print("||");
			}
			
			// かけられる数が増えるときに改行する処理
			System.out.println();
		}

	}

}
