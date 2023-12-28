package src1;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner stringScanner = new Scanner(System.in);
        String age = stringScanner.nextLine();
        System.out.println("How old are you? in numbers");
        int a = stringScanner.nextInt();
        System.out.println(age + " is a good age to be!");
        System.out.println(a + "is a good age to be");
    }
}
