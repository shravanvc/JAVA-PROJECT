package project;

import java.util.Scanner;

public class Practiceset4 {
    public static void main(String[] args) {

//        Problem 1
        int a = 10;
        if(a == 11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }

//        Problem 2
//        byte m1, m2 ,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in biology");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("the overall percentage is"+avg);
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33 ){
//            System.out.println("you have been passed the exam");
//        }
//        else{
//            System.out.println("sorry, you have not been passed the exam! please try again");
//        }

//        Problem 3
//        float tax = 0 ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your income in lakhs per annum");
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income > 2.5 && income <= 5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income > 5.0 && income <= 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income > 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.2f * (income - 10.0f);
//        }
//        System.out.println("the total tax paid by the employee is "+ tax);
//

//        Problem 4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Problem 6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organization website!");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an commercial website! ");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website! ");
        }

    }
}
