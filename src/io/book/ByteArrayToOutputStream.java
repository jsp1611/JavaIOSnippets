package io.book;

import java.io.OutputStream;

/**
 * @author jon poulton
 */
public class ByteArrayToOutputStream {

    public static void main(String[] args) throws Exception {
        // In ascii chars 48 to 122 are visible characters
        byte[] asciiChars = new byte[] {48, 55, 77, 121, 122, 101, 99, 98};

        OutputStream outputSteam = System.out;

        outputSteam.write(asciiChars);
    }
}
