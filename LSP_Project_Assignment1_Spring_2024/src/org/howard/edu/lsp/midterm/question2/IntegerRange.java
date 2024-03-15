package org.howard.edu.lsp.midterm.question2;

/**
 * A class representing a range of integers.
 */
public class IntegerRange implements Range {
    private final int lowerBound;
    private final int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     * @param lowerBound the lower bound of the range (inclusive)
     * @param upperBound the upper bound of the range (inclusive)
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean overlaps(Range other) {
        IntegerRange otherRange = (IntegerRange) other;
        return !(this.upperBound < otherRange.lowerBound || this.lowerBound > otherRange.upperBound);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Checks if two IntegerRange objects are equal.
     * Two IntegerRange objects are equal if their lower and upper bounds are the same.
     * @param obj the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }
}

