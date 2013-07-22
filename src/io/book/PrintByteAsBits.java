package io.book;

/**
 * Print the bit pattern for a byte
 *
 * @author jon poulton
 */
public class PrintByteAsBits {

    // Bit pattern 10000000
    private static int shiftMe = 128;

    public static void main(String[] args) {

        // The byte we want a bit pattern for
        int myByte = 98;

        for (int i = 0; i < 8; i++) {
            int b = shiftMe & myByte;
            if (b != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            shiftMe = shiftMe >>> 1;
        }
    }

}
