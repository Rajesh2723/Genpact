// Understanding break in switch. 
// An improved version of the season program.

class BreakInSwitch {
	public static void main(String args[]) {
		int month = Integer.parseInt(args[0]);
		String season;

		switch (month) {
			case 12:		
			case 1: 
			case 2:
				season = "Winter";
				break;
			case 3: 
			case 4: 
			case 5:
				season = "Summer";
				break;
			case 6: 
			case 7: 
			case 8:
				season = "Rainy";
				break;
			case 9: 
			case 10: 
			case 11:
				season = "Spring";
				break;
			default:
				season = "Bogus Month";
		}
		System.out.println("\nIts " + season);
	}
}