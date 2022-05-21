package com.bridgelabz;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserOperator {
    public void firstName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = sc.nextLine();
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your name "+firstName+" is Valid");
        }
        else{
            System.out.println("Your name "+firstName+" is Invalid");
        }
    }

    public void lastName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name");
        String lastName = sc.nextLine();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your last name "+lastName+" is Valid");
        }
        else{
            System.out.println("Your last name "+lastName+" is Invalid");
        }
    }

    public void emailAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email address");
        String emailAddress = sc.nextLine();
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your email "+emailAddress+" is Valid");
        }
        else{
            System.out.println("Your email "+emailAddress+" is Invalid");
        }
    }

    public void mobileNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number");
        String mobileNumber = sc.nextLine();
        String regex = "^(91)? [6-9][0-9]{9}+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your mobile number "+mobileNumber+" is Valid");
        }
        else{
            System.out.println("Your mobile number "+mobileNumber+" is Invalid");
        }
    }

    public void password(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.nextLine();
        String regex = "^[0-9a-zA-z]{8,}+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean valid=matcher.matches();
        if (valid==true){
            System.out.println("Your password "+password+" is Valid");
        }
        else{
            System.out.println("Your password "+password+" is Invalid");
        }
    }
}