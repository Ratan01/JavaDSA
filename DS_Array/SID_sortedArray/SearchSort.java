package DS_Array.SID_sortedArray;

import java.util.Scanner;

public class SearchSort {
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

        // Ask the user for the element to search
        System.out.print("Enter the element you want to search for: ");
        int elementToSearch = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(array, elementToSearch, 0, size - 1);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at position: " + (index + 1));
        } else {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }

        scanner.close();
    }

    // Binary search method
    public static int binarySearch(int[] array, int element, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the element is present at the mid
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

        // Element is not present in the array
        return -1;
    }
}
