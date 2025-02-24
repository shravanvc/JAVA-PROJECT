package project;

public class Data_type {
    public static void main(String[] args) {
        int a = 56+4;
        float b = 6.45f+5;
        byte x = 4;
        int y = 5;
        short z = 8;
        int n = x + y;
        float m = 6.56f + z;
        System.out.println(m);

//      Increment and Decrement operators
        int i = 56;
        int s = i++;
        System.out.println(s);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

//      Quick quiz
        int d = 7;
        int u = ++d * 8;
        System.out.println(u);

//      character increment
        int ch = 'A';
        System.out.println(++ch);
    }
}
