// 2..Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.


// logic:

import java.util.ArrayDeque;

public class ArrayQueue {
    public static void main(String[] args) {

        // Creating an ArrayDeque to store book names
        ArrayDeque<String> books = new ArrayDeque<>();

        // Adding books from both ends
        books.addFirst("The Great Gatsby");
        books.addLast("1984");
        books.addFirst("To Kill a Mockingbird");
        books.addLast("Moby-Dick");

        // Display the books
        System.out.println("Books in Queue: " + books);

        // Removing from both ends
        String removedFirst = books.removeFirst();
        System.out.println("Removed from front: " + removedFirst);

        String removedLast = books.removeLast();
        System.out.println("Removed from end: " + removedLast);

        // Display the updated books
        System.out.println("Updated Books in Queue: " + books);
    }
}


/*
output:

Books in Queue:  [To Kill a Mockingbird, The Great Gatsby, 1984, Moby-Dick]
Removed from front: To Kill a Mockingbird
Removed from end: Moby-Dick
Updated Books in Queue: [The Great Gatsby, 1984]

*/