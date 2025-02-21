package project;
import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        System.out.println("taking input from user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
   //     int a = sc.nextInt();
        float a = sc.nextFloat();
    //    boolean b1 = sc.hasNextFloat();
        //   System.out.println(b1);
        System.out.println("Enter number 2");
        float b = sc.nextFloat();
    //    int b = sc.nextInt();
    //    boolean b2 = sc.hasNextFloat();
    //    System.out.println(b2);
        float sum = a + b;
        System.out.println("the sum of these number is:");
        System.out.println(sum);
    }
}
