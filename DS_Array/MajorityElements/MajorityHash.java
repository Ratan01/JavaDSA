package DS_Array.MajorityElements;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityHash {
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

        // Step 1: Create a HashMap to store frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Traverse the array and count frequencies of elements
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Step 3: Find the majority element (if any)
        int majorityElement = -1; // -1 if no majority element is found
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > n / 2) {
                majorityElement = key;
                break;
            }
        }

        // Step 4: Output the result
        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element found.");
        }

        sc.close();
    }
}
