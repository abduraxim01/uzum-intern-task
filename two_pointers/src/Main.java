package src;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6};

        int length = removeDuplicates(numbers);

        int[] result = Arrays.copyOf(numbers, length);
        System.out.println(Arrays.toString(result));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }
}
