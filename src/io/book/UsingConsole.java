package io.book;

import java.io.Console;

/**
 * @author jon poulton
 */
public class UsingConsole {
    public static void main(String[] args) {
        Console console = System.console();
        // added in Java 6
        // Does not work in IDE as System.console returns null. Does work on command line
        console.printf("Enter your username: \n");
        String username = console.readLine();
        console.writer().println("Enter your password: ");
        char[] pwd = console.readPassword();

        for (int i = 0; i < pwd.length; i++) {
            pwd[i] = '*';
        }

        System.out.println("Username/password " + username + "/" + new String(pwd));
    }
}
