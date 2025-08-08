package practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnString {

	public static void main(String[] args) {
		//literals ways
		 String nameone="Testleaf";
		 //instantiation way
		 String nameTwo=new String("Testleaf");
		 String nameThree ="Testleaf";
		 String nameFour = new String("Testleaf");
		 System.out.println("Length of string nameFour is " +nameFour.length());
		 System.out.println("using Literals way " + System.identityHashCode(nameone));
		 System.out.println("using Literals way " + System.identityHashCode(nameTwo));
		 System.out.println("using Literals way " + System.identityHashCode(nameThree));
		 System.out.println("using Literals way " + System.identityHashCode(nameFour));
		 if(nameTwo.equals(nameFour))
		 {
			 System.out.println("Same");
		 }
		 else
		 {
			 System.out.println("Different");
		 }
		 if(nameone.contains("leaf"))
		 {
			 System.out.println("Partial values are same");
		 }
		 else
		 {
			 System.out.println("Partial values are not same");
		 }
		 char[] charArray = nameFour.toCharArray();
		 int len= charArray.length;
		 System.out.println("To display letters in sorted order");
		 Arrays.sort(charArray);
		 for(int i=0;i<len;i++)
		 {
			 System.out.print(charArray[i]);
		 }
		 System.out.println("");
		 System.out.println(nameThree.charAt(2));
		 System.out.println("**************************");
		 int j=0; // segment 1
			do {
				// (segment 2)
				System.out.println(nameFour.charAt(j));
				j++;// segment 3	
			}while (j<len);
		 
	}

}
