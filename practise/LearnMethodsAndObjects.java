package practise;

public class LearnMethodsAndObjects {
	int c;
	 String companyName;
	
	 void addnum() {
		int a=2,b=5,c;
		c=a+b;
		System.out.println(c);

	}
	int multiply(int a, int b) {
		return a*b;

	}
	private void addStudentDetails(int yearOfBirth, String Name) {
		System.out.println("The Year of birth is :"+yearOfBirth);
		System.out.println("The Name of the student is :"+Name);

	}

	public static void main(String[] args) {
		//create object
		LearnMethodsAndObjects obj = new LearnMethodsAndObjects();
		int multiply = obj.multiply(12, 12);
		System.out.println("The value of multiplication is :"+multiply);
		obj.addnum();
		obj.addStudentDetails(1990, "Meenambehai");
		obj.companyName="HCL";
		System.out.println("The value of the Global variable is :"+obj.companyName);


	}

}
