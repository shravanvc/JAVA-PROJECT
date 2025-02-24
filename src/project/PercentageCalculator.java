package project;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        double total = 0;
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks of subject :");
        double T = sc.nextDouble();
        System.out.println("enter the marks of s1 :");
        double s1 = sc.nextDouble();
        total = total + s1;
        System.out.println("enter the marks of s2 :");
        double s2 = sc.nextDouble();
        total = total + s2;
        System.out.println("enter the marks of s3 :");
        double s3 = sc.nextDouble();
        total = total + s3;
        System.out.println("enter the marks of s4 :");
        double s4 = sc.nextDouble();
        total = total + s4;
        System.out.println("enter the marks of s5 :");
        double s5 = sc.nextDouble();
        total = total + s5;
        double grandTotal = total*100 /(T*5);
        System.out.println("the student percentage is :"+grandTotal +"%");
    }
}
