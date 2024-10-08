package DS_Array.MajorityElements;

import java.util.Arrays;
import java.util.Scanner;

public class MajoritySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Assume the middle element is the majority candidate
        int candidate = arr[n / 2];

        // Step 3: Verify if the candidate is really a majority element
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        // Step 4: Check if the count of the candidate is more than n/2
        if (count > n / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element found.");
        }

        sc.close();
    }
}
