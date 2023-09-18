package ex01.basics;

public class Ex02DataTypes {

	public static void main(String[] args) {
		// Integer data types
		byte byteNum = 10;
		short shortNum = 12;
		int intNum = 100;
		long longNum = 280;
		
		System.out.println("\n Byte number = " + byteNum);
		System.out.println("\n Short number = " + shortNum);
		System.out.println("\n Integer number = " + intNum);
		System.out.println("\n Long number = " + longNum);
		
		// Decimal data types
		float amount = 321.2f;
		float discount = 35.76F;
		
		double nanoSecond = 121E-3;
		System.out.println("\n Amount = " + amount);
		System.out.println("\n Discount = " + discount);
		System.out.println("\n Nano Second = " + nanoSecond);
		
		double result = nanoSecond * amount;
		System.out.println("\n Result = " + result);
		
		// Character data type
		char gender = 'm';
		System.out.println("Gender : " + gender);
		
		// Boolean data type
		boolean isPassed = true;
		boolean isAbsent = false;
		System.out.println("\n isPassed : " + isPassed);
		System.out.println("\n isAbsent : " + isAbsent);
		System.out.println("\n 10 > 20 : " + (10 > 20));
		
		// Smaller data type variable cannot hold bigger data type value
		byte number1 = 10;
		short number2 = 20;
		
		// short can hold byte
		number2 = number1;
		
		// byte cannot hold short
		//number1 = number2;
		
		// type casting - bigger data can be forcibly put in shorter data type
		number1 = (byte)number2;
		System.out.println(number1);
		System.out.println(number2);
		
		// One more example
		// (destination-type)
		double doubleNum = 32.2;
		int num = (int)doubleNum;
		System.out.println("\n num = " + num);
		
		// Variable scope
		{
			int a = 10;
			System.out.println("\n a = " + a);
		}// a is destroyed
		
		// a is visible outside scope
		//System.out.println("\n a = " + a);
		
		// Scope explanation
		int x = 10;
		
		{
		//	double x = 20;
			System.out.println(x);
		}
		
		System.out.println(x);
		
		
		
	}

}
