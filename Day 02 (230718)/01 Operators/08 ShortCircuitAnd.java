
class ShortCircuitAnd {
	
    public static void main(String[] arg) {
		
        int c = 0, d = 100, e = 50;
        
		if( c == 1 && e++ < 100 )
        {                          
            d = 150;               
        }
		
        System.out.println("\n d = " + d );
        System.out.println("\n e = " + e );
	}
}