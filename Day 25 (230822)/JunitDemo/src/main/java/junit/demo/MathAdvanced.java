package junit.demo;

import java.util.Arrays;

public class MathAdvanced {
	
	public String[] sorted(String[] arrayToSort) {
		Arrays.sort(arrayToSort);
		return arrayToSort;
	}

	public double calculateArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String concatStrings(String[] strings) {
		
		String result = "";
		for(String str : strings) {
			result += str;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	
	
}
