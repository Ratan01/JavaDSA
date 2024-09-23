package DS_Array.SID_sortedArray;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        // Declare the array and get the sorted array elements from the user
        int[] array = new int[size + 1]; // Increase size by 1 to accommodate the new element
        System.out.println("Enter the elements of the sorted array (in ascending order):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the original sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Ask the user for the element to insert
        System.out.print("Enter the element you want to insert: ");
        int elementToInsert = scanner.nextInt();

        // Insert the element at the correct position to maintain sorted order
        size = insertElement(array, size, elementToInsert);

        // Display the array after insertion
        System.out.print("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    // Method to insert an element into a sorted array
    public static int insertElement(int[] array, int size, int element) {
        int i;
        
        // Find the correct position for the new element
        for (i = size - 1; (i >= 0 && array[i] > element); i--) {
            array[i + 1] = array[i]; // Shift elements to the right
        }
        
        // Insert the new element at the found position
        array[i + 1] = element;

        // Return the new size of the array
        return size + 1;
    }
}
