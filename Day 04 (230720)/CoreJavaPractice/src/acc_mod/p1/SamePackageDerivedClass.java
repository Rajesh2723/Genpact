
package acc_mod.p1;

class SamePackageDerivedClass extends BaseClass {
	
	SamePackageDerivedClass() {
		System.out.println("Same Package Derived Class Constructor");

		System.out.println("\n n_default   = " + n_default);
//		System.out.println("\n n_private   = " + n_private);
		System.out.println("\n n_protected = " + n_protected);
		System.out.println("\n n_public    = " + n_public);
	}
}
