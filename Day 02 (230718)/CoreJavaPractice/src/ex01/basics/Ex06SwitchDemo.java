package ex01.basics;
/*
if monthNumber = 12, 1, 2, Season = Winter
if monthNumber = 3, 4, 5, Season = Spring
if monthNumber = 6, 7, 8, Season = Rainy
if monthNumber = 9, 10, 11, Season = Summer
*/
public class Ex06SwitchDemo {

	public static void main(String[] args) {
		
		int monthNumber = 12;
		String season = "";
		switch(monthNumber) {
			case 12:
			case 1:
			case 2:
				season = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				season = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				season = "Rainy";
				break;
			case 9:
			case 10:
			case 11:
				season = "Summer";
				break;
			default:
				season = "Wrong value";
		}
		
		System.out.println(season);

	}

}
