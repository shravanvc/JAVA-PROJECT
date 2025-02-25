package project;

public class practiceset3 {
    public static void main(String[] args) {
//      Problem 1
        String name = "SHRAVAN KUMAR";
        String lower = name.toLowerCase();
        System.out.println(lower);

//      Problem 2
        String replace = name.replace(" ","_");
        System.out.println(replace);

//      Problem 3
        String letter = "Dear name, Thanks a lot";
        String rep = letter.replace("name","shravan");
        System.out.println(rep);

//      Problem 4
        String str = " the string contain double  and  triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

//      Problem 5
        String myLetter = "Dear harry, \n\tthank you so much. \n\tnice to meet you ";
        System.out.println(myLetter);


    }

}
