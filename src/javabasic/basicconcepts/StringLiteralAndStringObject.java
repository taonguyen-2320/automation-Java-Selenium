package javabasic.basicconcepts;

public class StringLiteralAndStringObject {

	public StringLiteralAndStringObject(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		StringLiteralAndStringObject emp1 = new StringLiteralAndStringObject("Phuong", "Lam");
		StringLiteralAndStringObject emp2 = new StringLiteralAndStringObject("Phuong", "Lam");
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
		System.out.println("---");
		
		String str1 = "VIN";
		String str2 = "VIN";
		String str3 = new String("VIN");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3); // one avairiable and on object cannot =
		System.out.println(str1.equals(str3));
		

	}

}
