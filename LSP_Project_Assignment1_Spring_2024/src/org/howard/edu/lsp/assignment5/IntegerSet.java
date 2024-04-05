package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robel
 * @version 1.0.0
 */

/**
 * Represents a set of integers, where each element is unique.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set;

    /**
     * Default constructor initializes the set as empty.
     */
    public IntegerSet() {
        this.set = new ArrayList<>();
    }

    /**
     * Constructor to initialize the set with a given collection of integers.
     * Ensures that the set contains no duplicates.
     * @param set Collection of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>();
        for (Integer item : set) {
            if (!this.set.contains(item)) {
                this.set.add(item);
            }
        }
    }

    /**
     * Clears the internal representation of the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return The length of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if another object is equal to this set.
     * Two sets are considered equal if they contain the same elements, in any order.
     * @param o The object to compare with.
     * @return True if the objects are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        if (this.set.size() != other.set.size()) return false;
        for (Integer item : this.set) {
            if (!other.set.contains(item)) return false;
        }
        return true;
    }

    /**
     * Checks if the set contains a specific value.
     * @param value The value to check for.
     * @return True if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * @return The largest item.
     * @throws RuntimeException If the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) throw new RuntimeException("Set is empty.");
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest item in the set.
     * @return The smallest item.
     * @throws RuntimeException If the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) throw new RuntimeException("Set is empty.");
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds an item to the set if it is not already present.
     * @param item The item to add.
     */
    public void add(int item) {
        if (!set.contains(item)) set.add(item);
    }

    /**
     * Removes an item from the set if it is present.
     * @param item The item to remove.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Updates this set to be the union of itself and another set.
     * @param intSetb The other set to union with.
     */
    public void union(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            if (!this.set.contains(item)) this.set.add(item);
        }
    }

    /**
     * Updates this set to be the intersection of itself and another set.
     * @param intSetb The other set to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        this.set.retainAll(intSetb.set);
    }

    /**
     * Updates this set to be the difference of itself and another set.
     * @param intSetb The other set to differentiate with.
     */
    public void diff(IntegerSet intSetb) {
        this.set.removeAll(intSetb.set);
    }

    /**
     * Checks if the set is empty.
     * @return True if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return String representation of the set.
     */
    public String toString() {
        return set.toString();
    }
}