package src1;

import java.util.Scanner;

public class var_test4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input first number");
        int a= obj.nextInt();
        System.out.println("Input second number");
        int b= obj.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+a*b);


    }
}
