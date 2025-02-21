package project;

public class OperatorPrecedence {
    public static void main(String[] args) {
//        int a = 6*5-34/2;
        /*
        highest precedence goes to * and /
        and Associativity is left to right
         =30-34/2
         =30-17
         =13
        */
//        int b = 60/5-34*2;
         /*
          =12-34*2
          =12-68
          =-56
         */
//        System.out.println(a);
//        System.out.println(b);
        // precedence and associativity

        // Quick quiz
        float x = 5;
        float y = 1;
//        float k = x * y/2;

        float a =2;
        float b =4;
        float c =5;
        float  k = b*b - (4*a*c)/(2*a);
        System.out.println(k);
    }
}
