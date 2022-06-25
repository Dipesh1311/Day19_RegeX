package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegeXOperation {
    static void userFirstName() {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true)
            userLastName();
        else
            System.out.println("First Name is Invalid");
    }
    public static void userLastName() {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == true)
            userEmail();
        else
            System.out.println("Last Name is Invalid");
    }
    public static void userEmail(){
        String emailPattern= "[a-zA-Z0-9.+-]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]*";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        Pattern pattern2=Pattern.compile(emailPattern);
        Matcher matcher2=pattern2.matcher(email);
        boolean result2=matcher2.matches();

        if(result2== true){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is not valid");
        }
    }

    public void mobileNumberValidation() {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern="(91-)?[0-9]{10}";
        System.out.println("Enter the phone number");
        String phoneNumber=scanner.next();

        Pattern pattern3=Pattern.compile(MobileNumberPattern);
        Matcher matcher3=pattern3.matcher(phoneNumber);
        Boolean result3=matcher3.matches();

        if(result3==true){
            System.out.println("Mobile number is valid");
        }else{
            System.out.println("Mobile number is invalid");
        }
    }
    public static void passwordValidation(){
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern="[a-zA-Z0-9~!@#$]{8,}";
        System.out.println("Enter the Password");
        String passWord=scanner.next();

        Pattern pattern4=Pattern.compile(PasswordPattern);
        Matcher matcher4=pattern4.matcher(passWord);
        Boolean result4=matcher4.matches();

        if(result4==true){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid,please enter minimum 8 character");
        }
    }
    public static void passwordValidation2(){
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern2="[A-Z]+[a-zA-Z0-9~!@#$]{7,}";
        System.out.println("Enter the Password to check Rule2");
        String passWord2=scanner.next();

        Pattern pattern5=Pattern.compile(PasswordPattern2);
        Matcher matcher5=pattern5.matcher(passWord2);
        Boolean result5=matcher5.matches();

        if(result5==true){
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid,please enter minimum 8 character");
        }
    }

}

