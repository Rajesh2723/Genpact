// Simple switch-case-default statement
 
class SwitchCaseDefault {
	public static void main(String [] args) {
		int option = 1;

		switch (option) {
			case 1:
				System.out.println("\n Case 1");
				break;
			case 2:
				System.out.println("\n Case 2");
				break;
			case 3:
				System.out.println("\n Case 3");
				break;
			default:
				System.out.println("\n Default");
		}
		
		System.out.println("\nOutside Switch");
		
	}
}