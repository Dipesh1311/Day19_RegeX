package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public void multipleEmailValidation() {
        String email1 = "abc@yahoo.com";
        String email2 = "abc-100@yahoo.com";
        String email3 = "abc.100@yahoo.com";
        String email4 = "abc111@abc.com";
        String email5 = "abc-100@abc.net";
        String email6 = "abc.100@abc.com.au";
        String email7 = "abc@1.com";
        String email8 = "abc@gmail.com";
        String email9 = "abc+100@gmail.com";
        String email10 = "abc";

        String multipleEmailPattern = "[a-zA-Z0-9.+-]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]*";

        Pattern patterns1 = Pattern.compile(multipleEmailPattern);
        Matcher matchers1 = patterns1.matcher(email1);
        boolean results1 = matchers1.matches();

        if (results1 == true)
            System.out.println("results1 is Valid");
        else
            System.out.println("results1 is Invalid");

        Pattern patterns2 = Pattern.compile(multipleEmailPattern);
        Matcher matchers2 = patterns2.matcher(email2);
        boolean results2 = matchers2.matches();

        if(results2 == true)
            System.out.println("results2 is Valid");
        else
            System.out.println("results2 is Invalid");

        Pattern patterns3 = Pattern.compile(multipleEmailPattern);
        Matcher matchers3 = patterns3.matcher(email3);
        boolean results3 = matchers3.matches();

        if(results3 == true)
            System.out.println("results3 is Valid");
        else
            System.out.println("results3 is Invalid");

        Pattern patterns4 = Pattern.compile(multipleEmailPattern);
        Matcher matchers4 = patterns4.matcher(email4);
        boolean results4 = matchers4.matches();

        if(results4 == true)
            System.out.println("results4 is Valid");
        else
            System.out.println("results4 is Invalid");

        Pattern patterns5 = Pattern.compile(multipleEmailPattern);
        Matcher matchers5 = patterns5.matcher(email5);
        boolean results5 = matchers5.matches();

        if(results5 == true)
            System.out.println("results5 is Valid");
        else
            System.out.println("results5 is Invalid");

        Pattern patterns6 = Pattern.compile(multipleEmailPattern);
        Matcher matchers6 = patterns6.matcher(email6);
        boolean results6 = matchers6.matches();

        if(results6 == true)
            System.out.println("results6 is Valid");
        else
            System.out.println("results6 is Invalid");

        Pattern patterns7 = Pattern.compile(multipleEmailPattern);
        Matcher matchers7 = patterns7.matcher(email7);
        boolean results7 = matchers7.matches();

        if(results7 == true)
            System.out.println("results7 is Valid");
        else
            System.out.println("results7 is Invalid");

        Pattern patterns8 = Pattern.compile(multipleEmailPattern);
        Matcher matchers8 = patterns8.matcher(email8);
        boolean results8 = matchers8.matches();

        if(results8 == true)
            System.out.println("results8 is Valid");
        else
            System.out.println("results8 is Invalid");

        Pattern patterns9 = Pattern.compile(multipleEmailPattern);
        Matcher matchers9 = patterns9.matcher(email9);
        boolean results9 = matchers9.matches();

        if(results9 == true)
            System.out.println("results9 is Valid");
        else
            System.out.println("results9 is Invalid");

        Pattern patterns10 = Pattern.compile(multipleEmailPattern);
        Matcher matchers10 = patterns10.matcher(email10);
        boolean results10 = matchers10.matches();

        if(results10 == true)
            System.out.println("results10 is Valid");
        else
            System.out.println("results10 is Invalid");
    }
}
