
package acc_mod.p1;

class SamePackage {
	SamePackage() {
		BaseClass b = new BaseClass();

		System.out.println("Same Package Class Constructor");
		System.out.println("\n n_default   = " + b.n_default);
//		System.out.println("\n n_private   = " + b.n_private);
		System.out.println("\n n_protected = " + b.n_protected);
		System.out.println("\n n_public    = " + b.n_public);
	}
}
