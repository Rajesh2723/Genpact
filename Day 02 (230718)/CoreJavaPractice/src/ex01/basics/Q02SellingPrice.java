package ex01.basics;

// Step1: Create the class
public class Q02SellingPrice {

	// Step2: Create the main()
	public static void main(String[] args) {
		
		// Step3: Declare all the variables
		double buyingPrice, discount, GST, profitMargin, sellingPrice;
		
		// Step4: Input values
		buyingPrice = 100; // in Rs
		discount = 20; // in %
		GST = 10; // in %
		profitMargin = 50; // in %

		// Step5: Calculating Rs
		double discountInRs, gstInRs, profitMarginInRs;
		double newPriceAfterDiscount;
		
		discountInRs = buyingPrice * discount/100;//20
		newPriceAfterDiscount = buyingPrice - discountInRs;//80
		gstInRs = newPriceAfterDiscount * GST/100;//8
		profitMarginInRs = newPriceAfterDiscount * profitMargin/100;//40
		
		sellingPrice = newPriceAfterDiscount + gstInRs + profitMarginInRs;
		
		System.out.println(sellingPrice);		

	}

}
