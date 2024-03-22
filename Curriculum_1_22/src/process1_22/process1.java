package process1_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class process1 {
	String str ="寿司";
	public String greet(String str){
		String greet = "こんにちは！ここは" + str + "です！";
		return greet;
	}
	
	public String food() {
		String good = "この" + this.str + "はうまい";
		return good;
	}
	public String meal(String str) {
		String meal = this.str + "は" +str+ "です";
		return meal;
	}
	
	public String dayTime(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		 LocalDateTime dt = LocalDateTime.now();
		 String day = dt.format(dtf);
		 return day;
	}

}
