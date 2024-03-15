package org.howard.edu.lsp.midterm.question2;

/**
 * A class for testing the IntegerRange class.
 */
public class RangeTester {
    /**
     * Main method to test the IntegerRange class.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);

        // Testing contains method
        System.out.println("Range 1 contains 7: " + range1.contains(7)); // true
        System.out.println("Range 2 contains 20: " + range2.contains(20)); // false

        // Testing overlaps method
        System.out.println("Ranges overlap: " + range1.overlaps(range2)); // true

        // Testing size method
        System.out.println("Size of range 1: " + range1.size()); // 6

        // Testing equals method
        IntegerRange range3 = new IntegerRange(5, 10);
        System.out.println("Range 1 equals range 3: " + range1.equals(range3)); // true
    }
}

