package utils;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner sc = new Scanner(System.in);

    public static String regexStr(String input, String regex, String erros) {
       Boolean check = true;
        do {
            if (input.matches(regex)) {
                check = false;
            }else {
                System.out.println(erros);
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }

    public static String regexAge(String input, String regex) {
        Boolean check = true;
        do {
            try {
                if (Pattern.matches(regex,input)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(input, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age,now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    }else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và nhỏ hơn 100!!!\nVui lòng nhập lại:");
                    }
                }else {
                    throw new AgeException("Định dạng nhập vào không đúng!!!\\nĐịnh dạng đúng cho ngày sinh phải là: dd/MM/yyyy\nVui lòng nhập lại:");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }
}
