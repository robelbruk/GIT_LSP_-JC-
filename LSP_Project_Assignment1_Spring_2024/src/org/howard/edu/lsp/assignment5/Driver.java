package org.howard.edu.lsp.assignment5;

public class Driver {

    public static void main(String[] args) {
        // Create an empty IntegerSet
        IntegerSet set1 = new IntegerSet();
        System.out.println("Initial value of Set1 is: " + set1);

        // Adding elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("After adding 1, 2, 3 - Value of Set1 is: " + set1);

        // Display smallest and largest elements
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Create another IntegerSet and add elements
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Initial value of Set2 is: " + set2);

        // Union of Set1 and Set2
        System.out.println("Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2 is: " + set1);

        // Intersection of Set1 and Set2
        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2 is: " + set1);

        // Difference of Set1 and Set2
        set1.diff(set2);
        System.out.println("Difference of Set1 and Set2 is: " + set1);

        // Check if set contains a value
        System.out.println("Set1 contains 2: " + set1.contains(2));
        System.out.println("Set1 contains 5: " + set1.contains(5));

        // Remove an element from Set1
        set1.remove(2);
        System.out.println("After removing 2 - Value of Set1 is: " + set1);

        // Clear Set1 and check if it's empty
        set1.clear();
        System.out.println("After clearing, Set1 is empty: " + set1.isEmpty());
    }
}
