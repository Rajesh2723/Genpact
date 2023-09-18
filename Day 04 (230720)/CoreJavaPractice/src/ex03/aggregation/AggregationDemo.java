package ex03.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		Certificate cert1 = new Certificate("OCJP", 25000);

		Student student1 = new Student("Kaustubh", cert1);
		Student student2 = new Student("Ashutosh", cert1);
		
		Student student3 = new Student("Ritu", new Certificate("OCJA", 35000));
		
		// display the properties of student Kaustubh
		System.out.println("----------Display------------");
		System.out.println("\n Name : " + student1.getName());
		System.out.println("\n Cert name : " + student1.getCertificate().getName());
		System.out.println("\n Cert price : " + student1.getCertificate().getFees());

		// change the name of Kaustubh to Kaustubh Choudhary
		System.out.println("----------Modify------------");
		student1.setName("Kaustubh Choudhary");
		System.out.println("\n Name : " + student1.getName());
		
		// change the certificate price from 25000 -> 28000
		student1.getCertificate().setFees(28000);
		System.out.println("\n Cert price : " + student1.getCertificate().getFees());
		
	}

}
