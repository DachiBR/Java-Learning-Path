package Basic;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String [] arguments){
        int num1, num2;

        System.out.println("Enter first number : ");
        Scanner sc =  new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();
        sc.close();
        System.out.println("Sum is: " + (num1+num2));
    }
}
