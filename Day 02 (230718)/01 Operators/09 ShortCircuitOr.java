
class ShortCircuitOr {

	public static void main(String[] args) {

		int c = 1, d = 100, e = 50;
		
		if( c == 1 | ++e < 100 )
		{
			d = 150;
		}
		
		System.out.println("\n d = " + d );
		System.out.println("\n e = " + e );
	}
}