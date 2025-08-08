package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> mentors;
		mentors = new ArrayList<String>();
		mentors.add("Deepa");
		mentors.add("priya");
		mentors.add("Lakshmi");
		mentors.add("Arya");
		System.out.println("To diplay the elements in the List");
		for (String name : mentors) {
			
			System.out.println(name);
		}
		System.out.println("To display the element in sorted order");
		Collections.sort(mentors);
		for (String name : mentors) {
			
			System.out.println(name);
		}
		mentors.add(1, "Meena");
		System.out.println(mentors);
		Object[] array = mentors.toArray();
		System.out.println(array[3]);
		
	}

}
