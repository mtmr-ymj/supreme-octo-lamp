package execution1_23;

import java.util.Optional;

import process1_23.process;

public class execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// processを読み込む
		process animal = new process();
		
		// 値をセットする
		animal.setName("ライオン");
		animal.setBody(2.1);
		animal.setSpeed(80);
		
		// optionalでnullチェックする値を指定する
		Optional<String> checkName = Optional.ofNullable(animal.getName());
		Optional<Double> checkBody = Optional.ofNullable(animal.getBody());
		Optional<Integer> checkSpeed = Optional.ofNullable(animal.getSpeed());
		
		// コンソールに出力する
		System.out.println("動物名:" + checkName.orElse("nullです"));
		System.out.println("体長:" + checkBody.orElse(0.00) + "m");
		System.out.println("速度:" + checkSpeed.orElse(000) + "km/h");

	}

}
