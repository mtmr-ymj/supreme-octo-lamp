package execution1_22;

import java.util.Optional;

import process1_22.process1;

public class execution {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		process1 str = new process1();
		
		String greet = str.greet("日本");
		String food = str.food();
		String meal = str.meal("和食");
		String day = str.dayTime();
		
		
		Optional<String> value1 = Optional.ofNullable(greet);
		greet = value1.orElse("nullです");
		System.out.println(greet);
		
		Optional<String> value2 = Optional.ofNullable(food);
		food = value2.orElse("nullです");
		System.out.println(food);
		
		Optional<String> value3 = Optional.ofNullable(meal);
		meal = value3.orElse("nullです");
		System.out.println(meal);
		
		Optional<String> value4 = Optional.ofNullable(day);
		day = value4.orElse("nullです");
		System.out.println(day);

	}

}
