package NPTEL5;
import java.util.Scanner;

public class prg1 {

    // Interface definition
    interface Number {
        int findSqr(int i);  // Method to find the square of a number
    }

    // Class A implements the Number interface
    static class A implements Number {
        // Implement the findSqr method to return the square of the number
        public int findSqr(int i) {
            return i * i;  // Return the square of i
        }
    }

    public static void main(String[] args) {
        A a = new A();   // Create an object of class A
        // Read a number from the keyboard
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  // Read input number
        System.out.print(a.findSqr(i));  // Print the square of the number
        sc.close();  // Close the Scanner object
    }
}
