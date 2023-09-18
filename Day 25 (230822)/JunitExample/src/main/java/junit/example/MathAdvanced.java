package junit.example;

import java.util.Arrays;

public class MathAdvanced {

	public String[] sorted(String[] strings) {
		Arrays.sort(strings);
		return strings;
	}
	
	public static String concatStrArr(String[] strings) {
		String result = "";
		for(String str : strings) {
			result += str;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}