// Use a string to control a switch statement.

class StringSwitch {
	
	public static void main(String args[]) {

		String str = "four";
		
		switch(str) {
			
			case "one":
				System.out.println("one");
				break;
			case "two": 
				System.out.println("two");
				break;
			case "three":
				System.out.println("three");
				break;
			default: 
				System.out.println("no match");
				break;
		}
		
		System.out.println("\nOutside switch");
	}
}