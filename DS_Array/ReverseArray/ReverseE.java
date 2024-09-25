package DS_Array.ReverseArray;

import java.util.Scanner;
import java.util.Stack;
/*
 * Reverse an Array stack in java taking input from user
 */
public class ReverseE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            stack.push(array[i]);  // Pushing elements onto the stack
        }
        
        // Popping elements from the stack to reverse the array
        for (int i = 0; i < n; i++) {
            array[i] = stack.pop();
        }
        
        // Printing the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
