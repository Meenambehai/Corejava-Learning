package src1;
import java.util.Scanner;
public class debug {
    public static void main(String[] args)

    {

        Scanner s = new Scanner(System.in);
        //System.out.println("Enter string input");
       // String str = s.nextLine();
        System.out.println("Enter int value");
        int i = s.nextInt();
        System.out.println("Enter double value");
        double j = s.nextDouble();

        //String k = s.nextLine();
        System.out.println("Enter string input");
        String str = s.next();
        s.close();



        System.out.println("String: " + str);

        System.out.println("Double: " + j);

        System.out.println("Int: " + i);

        //s.close();

    }
}
