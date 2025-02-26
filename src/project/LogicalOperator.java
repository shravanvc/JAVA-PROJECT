package project;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("for logiacal and");
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("for logiacal or");
        if(a || b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("for logical not");
        System.out.println("Not(a) is");
        System.out.println(!a);
        System.out.println("Not(b) is");
        System.out.println(!b);
    }
}
