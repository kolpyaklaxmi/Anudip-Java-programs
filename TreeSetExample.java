// 3. Write a program using TreeSet insert Integer values and print them.

// logic :

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet to store integer values
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding integers to the TreeSet
        numbers.add(35);
        numbers.add(20);
        numbers.add(60);
        numbers.add(10);
        numbers.add(40);

        // Displaying the elements (TreeSet stores them in sorted order)
        System.out.println("Sorted TreeSet: " + numbers);
    }
}




/* output :

Sorted TreeSet: [10, 20, 35, 40, 60]




*/