package ex05.meth_ref.cons;

class Tax {
	double taxPercentage;

	public Tax(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	@Override
	public String toString() {
		return "Tax [taxPercentage=" + taxPercentage + "]";
	}

}

@FunctionalInterface
interface Taxable {
	Tax getTaxDetails(double txPc);
}

public class ConstructorRefDemo {

	public static void main(String[] args) {
		Taxable t = Tax::new;
		System.out.println(t.getTaxDetails(20));
	}

}
