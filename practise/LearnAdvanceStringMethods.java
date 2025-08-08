package practise;

public class LearnAdvanceStringMethods {

	public static void main(String[] args) {
		String sentence ="Testleaf is your Favourite automation Partner";
		String[] split = sentence.split("\\s");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		System.out.println("****substring*****");
		System.out.println("Substring from 2 to 6"+sentence.substring(2, 6));
		System.out.println("Replace");
		System.out.println(sentence.replace("automation", "Selenium"));
		System.out.println(sentence.replaceAll("\\s", "@"));
		
	}

}
