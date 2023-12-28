package src1;

import java.util.Scanner;

public class var_test3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input first number");
        int a = obj.nextInt();
        System.out.println("Input Second number");
        int b= obj.nextInt();
        int c=a*b;
        System.out.println(a+ "* " +b+ "=" +c);
    }
}
