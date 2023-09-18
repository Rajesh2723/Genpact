
package acc_mod.p2;

import acc_mod.p1.BaseClass;

// Everything that you want to use outside package should not be default

class OtherPackage {
	OtherPackage() {
		BaseClass b = new BaseClass();
		
		System.out.println("Other Package Class Constructor");

//		System.out.println("\n n_default   = " + b.n_default);
//		System.out.println("\n n_private   = " + b.n_private);
//		System.out.println("\n n_protected = " + b.n_protected);
		
		System.out.println("\n n_public    = " + b.n_public);
	}
}
