package DS_Array.SID_unsortedArray;

import java.util.Scanner;

public class SearchUn {
   public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] arr = new int[size];

        // Ask the user to input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask the user for the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        // If the element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
