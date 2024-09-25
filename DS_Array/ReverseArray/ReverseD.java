package DS_Array.ReverseArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ReverseD {
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
        Collections.reverse(Arrays.asList(array));

        System.out.println("Reversed Array: "+Arrays.toString(array));
    }
}
