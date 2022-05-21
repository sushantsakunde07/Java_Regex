package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name ");
        String firstName = sc.nextLine();
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean valid = matcher.matches();
        if (valid == true) {
            System.out.println("Your name " + firstName + " is Valid");
        } else {
            System.out.println("Your name " + firstName + " is Invalid");
        }
    }
}

