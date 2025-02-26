package project;
import java.util.Locale;
public class String_methods {
    public static void main(String[] args) {
        String name = "Shravan";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lower = name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String nonTrimmedString ="   Shravan     ";
        System.out.println(nonTrimmedString);
        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println(name.substring(0,5));

        String replace = name.replace('v','p');
        System.out.println(replace);
        System.out.println(name.replace("r","sha"));

        System.out.println(name.startsWith("Shr"));
        System.out.println(name.endsWith("van"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a",4));

        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("a",2));

        System.out.println(name.equals("Shravan"));

        System.out.println(name.equalsIgnoreCase("shravan"));

        System.out.println("i am escape sequence \\ double Quote ");

    }
}
