
package acc_mod.p2;

import acc_mod.p1.BaseClass;

class OtherPackageDerivedClass extends BaseClass {
	OtherPackageDerivedClass() {

		System.out.println("\n Different Package Derived Class");

//		System.out.println("\n n_default   = " + n_default);
//		System.out.println("\n n_private   = " + n_private);
		
		System.out.println("\n n_protected = " + n_protected);	
		System.out.println("\n n_public    = " + n_public);
	}
}
