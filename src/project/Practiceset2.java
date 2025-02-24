package project;

import java.util.Scanner;

public class Practiceset2 {
//    problem 1
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

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
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(m>8);

    }
}
