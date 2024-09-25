package DS_Array.ReverseArray;

import java.util.Scanner;
/*
 * Reverse an Array using a Loop (array is reversed by swapping the 
 * first and last elements, the second and second-last, and so on, 
 * until the middle of the array is reached)
 */
public class ReverseB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Reversing the array in place
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i]; // Store the element at index i
            array[i] = array[n - i - 1]; // Swap the element with its counterpart from the end
            array[n - i - 1] = temp; // Complete the swap
        }
        
        // Printing the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
