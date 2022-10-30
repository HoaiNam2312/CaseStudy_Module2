package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String regex = "^[A-Z]\\w+$";
        String input = "villa";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher("villa");
        System.out.println(input.matches(regex));
    }
}
