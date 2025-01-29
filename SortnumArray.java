//1.Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]

public class SortArray {
    public static void main(String[] args) {
        // Given array of integers
        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

        // Printing the original array before sorting
        System.out.println("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Bubble Sort to sort the array in ascending order
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

/*
Output:
Original array:
45 35 56 67 78 89 78 12 20
Sorted array in ascending order:
12 20 35 45 56 67 78 78 89
*/
