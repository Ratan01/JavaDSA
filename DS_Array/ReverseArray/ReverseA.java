package DS_Array.ReverseArray;

import java.util.Scanner;
/*
 * Reverse an Array using an extra Array
 */
public class ReverseA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        int[] reversedArray = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Reversing the array using an extra array
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - i - 1];
        }
        
        // Printing the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
