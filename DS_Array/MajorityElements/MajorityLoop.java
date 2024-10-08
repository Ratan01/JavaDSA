package DS_Array.MajorityElements;

import java.util.Scanner;

public class MajorityLoop {
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

        // Majority element initialization
        int majorityElement = -1; // -1 if no majority element is found
        int count;

        // Nested loop to find the majority element
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Check if count of the current element is greater than n/2
            if (count > n / 2) {
                majorityElement = arr[i];
                break;
            }
        }

        // Output the result
        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element found.");
        }
        
        sc.close();
    }
}
