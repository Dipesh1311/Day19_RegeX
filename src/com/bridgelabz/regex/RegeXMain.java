package com.bridgelabz.regex;

public class RegeXMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        RegeXOperation operation = new RegeXOperation();
        EmailValidation emailValidation = new EmailValidation();
        operation.userFirstName();
        emailValidation.multipleEmailValidation();
    }
}
