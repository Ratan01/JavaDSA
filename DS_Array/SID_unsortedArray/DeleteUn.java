package DS_Array.SID_unsortedArray;

import java.util.Scanner;

public class DeleteUn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array and get the array elements from the user
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.print("Original Array: ");
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
        System.out.print("Array after deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    // Method to delete an element from the array
    public static int deleteElement(int[] array, int size, int element) {
        // Find the element's position
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == element) {
                break;
            }
        }

        // If the element is not found, return the original size
        if (i == size) {
            System.out.println("Element not found in the array.");
            return size;
        }

        // Shift elements to the left to overwrite the deleted element
        for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }

        System.out.println("Element " + element + " deleted from the array.");

        // Return the new size of the array
        return size - 1;
    }
}
