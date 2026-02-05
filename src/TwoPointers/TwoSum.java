package TwoPointers;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static int[] twoSum1(int[] nums, int target) {
        // TC - O(N^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // if no pair found
        return new int[] { -1, -1 };
    }

    static int[] twoSum2(int[] nums, int target) {
        // TC - O(N) SC- O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (map.containsKey(complement)) {
                int complementIndex = map.get(complement);
                return new int[] { complementIndex, i };
            }

            map.put(nums[i], i);
        }
        // if no pair found
        return new int[] { -1, -1 };
    }

    static int[] twoSum3(int[] nums, int target) {
        // TC - O(N)
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[] { i, j };
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        // if no pair found
        return new int[] { -1, -1 };
    }

    static int[] twoSum4(int[] nums, int target) {
        // TC - O(N) + O(nlogn) -> O(nlogn) use only if said to return number becuase returing index wont work because it will chnage the indexing whle sorting
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[] { i, j };
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        // if no pair found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = sc.nextInt();
        sc.close();

        int[] result = twoSum3(arr, target);

        if (result[0] == -1) {
            System.out.println("No two sum pair found");
        } else {
            System.out.println("Indexes are: " + Arrays.toString(result));
        }
    }
}
