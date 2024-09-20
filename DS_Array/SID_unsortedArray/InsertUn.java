package DS_Array.SID_unsortedArray;

import java.util.Scanner;

public class InsertUn {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array with one extra space for the new element
        int[] arr = new int[size + 1];

        // Ask the user to input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask the user for the element to insert
        System.out.print("Enter the element to insert: ");
        int newElement = scanner.nextInt();

        // Ask the user for the position to insert the element
        System.out.print("Enter the position (index) to insert the element (0 to " + size + "): ");
        int position = scanner.nextInt();

        // Validate the position
        if (position < 0 || position > size) {
            System.out.println("Invalid position! Position must be between 0 and " + size);
        } else {
            // Shift elements to the right to make space for the new element
            for (int i = size; i > position; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert the new element
            arr[position] = newElement;

            // Print the updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
