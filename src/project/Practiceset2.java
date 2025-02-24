package project;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practiceset2 {
//    problem 1
    public static void main(String[] args) {
        float b = 7/4.0f * 9/2.0f;
        System.out.println(b);

//     problem 2
//        Encrypt
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

//        Decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);

//        Problem 3
//        comparison operator
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        System.out.println(m>8);

//        Problem 4
        int v =4;
        int u =7;
        int a =5;
        int f = (v*v-u*u)/2*a*5;
        System.out.println(f);

//        Problem 5
        int x = 7;
        int c = 7*49/7+35/7;
        System.out.println(c);

    }
}
