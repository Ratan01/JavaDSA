package DS_Array.SID_sortedArray;

import java.util.Scanner;

public class DeleteSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        // Declare the array and get the sorted array elements from the user
        int[] array = new int[size];
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

        // Ask the user for the element to delete
        System.out.print("Enter the element you want to delete: ");
        int elementToDelete = scanner.nextInt();

        // Delete the element if it exists
        size = deleteElement(array, size, elementToDelete);

        // Display the array after deletion
        if (size != -1) {
            System.out.print("Array after deletion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }

    // Method to delete an element from a sorted array
    public static int deleteElement(int[] array, int size, int element) {
        // Find the index of the element to delete using binary search
        int index = binarySearch(array, element, 0, size - 1);

        // If element is not found, return -1
        if (index == -1) {
            return -1;
        }

        // Shift elements to the left to overwrite the deleted element
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Return the new size of the array
        return size - 1;
    }

    // Binary search method to find the element in the array
    public static int binarySearch(int[] array, int element, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the element is present at mid
            if (array[mid] == element) {
                return mid;
            }

            // If the element is greater, ignore the left half
            if (array[mid] < element) {
                low = mid + 1;
            }
            // If the element is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Return -1 if the element is not found
        return -1;
    }
}
