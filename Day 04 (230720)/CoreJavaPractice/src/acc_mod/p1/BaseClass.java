
package acc_mod.p1;

public class BaseClass {
	
	int n_default = 1;
	private int n_private = 2;
	protected int n_protected = 3;
	public int n_public = 4;

	public BaseClass() {
		
		System.out.println("\n Base Class Constructor");
		System.out.println("\n n_default   = " + n_default);
		System.out.println("\n n_private   = " + n_private);
		System.out.println("\n n_protected = " + n_protected);
		System.out.println("\n n_public    = " + n_public);
	
	}
}
