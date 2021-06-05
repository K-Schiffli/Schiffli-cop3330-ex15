/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String pWord = getPassword();
        String validation = validatePassword(pWord);
        printOutput(validation);
    }
    public static String getPassword()
    {
        System.out.println( "What is the password? " );
        return in.nextLine();
    }

    public static String validatePassword(String password)
    {
        String savedPassword = "abc$123";
        if (savedPassword.equals(password))
        {
            return "Welcome!";
        }
        else return "I don't know you.";
    }

    public static void printOutput(String output)
    {
        System.out.println( output );
    }
}
