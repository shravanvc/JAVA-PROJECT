package project;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String var = "Shravan";

        switch (var){
            case "Shravan":
                System.out.println("You are going to become an adult!");
                break;
            case "Harry":
                System.out.println("You are going to join a job!");
                break;
            case "peter":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thank You!");

    }
}
