package io.book;

/**
 * @author jon poulton
 */
public class ByteAssignment {

    private static byte first = (byte)127;

    private static byte second = 0;

    private static byte third = (byte)300;

    public static void main(String[] args) {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Now this is fricking annoying
        // They get upcast to integers on addition, so you have to cast them back to byte
        first = (byte)(second + third);
        System.out.println(first);
    }
}
