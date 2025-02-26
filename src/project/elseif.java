package project;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age > 56) {
            System.out.println("You are experienced!");
        }
        else if (age > 46) {
            System.out.println("You are semi-experienced!");
        }
        else if (age>37){
            System.out.println("You are semi- semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
    }
}
