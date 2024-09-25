package DS_Array.ReverseArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * Reverse an Array using inbuilt method in java taking input from user
 */
public class ReverseC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        Integer[] array = new Integer[n]; // Using Integer instead of int for Collections to work
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Convert the array to a list
        List<Integer> list = Arrays.asList(array);
        
        // Reverse the list using inbuilt method
        Collections.reverse(list);
        
        // Convert the list back to an array (optional, as list is already reversed)
        array = list.toArray(new Integer[0]);
        
        // Printing the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
