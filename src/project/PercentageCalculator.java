package project;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks in Physics :");
        double m1 = sc.nextDouble();
        System.out.println("enter the marks in Chemistry :");
        double m2 = sc.nextDouble();
        System.out.println("enter the marks in Biology :");
        double m3 = sc.nextDouble();
        System.out.println("enter the total marks :");
        double T = sc.nextDouble();
        double TP = (m1+m2+m3)*100;
        double percentage = (T/TP)*100;
        System.out.println("the student percentage is :"+percentage +"%");
    }
}
