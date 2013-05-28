package io.book;

import java.io.Console;
import java.math.BigInteger;

/**
 * @author jon poulton
 */
public class HomeWork {

    // Enter integer and print squares of that integer from 1 to that integer
    public static void main(String[] args) {
        Console console = System.console();
        String input = console.readLine("Please enter an integer: ");
        BigInteger integer = new BigInteger(input);
        if (integer.signum() == 1) {
            BigInteger ctr = BigInteger.ONE;
            while (ctr.compareTo(integer) < 1) {
                System.out.println(ctr.multiply(ctr).toString());
                ctr = ctr.add(BigInteger.ONE);
            }
        } else {
            BigInteger ctr = BigInteger.ONE;
            while (ctr.compareTo(integer) > -1) {
                System.out.println(ctr.multiply(ctr).toString());
                ctr = ctr.subtract(BigInteger.ONE);
            }
        }
    }
}
