package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateSortedArray {
    static int[] removeDuplicate(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 1, 2, 2, 3 };
        sc.close();

        int[] result = removeDuplicate(arr);
        System.out.println(Arrays.toString(result));
    }
}
