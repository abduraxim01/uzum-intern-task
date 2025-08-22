package src;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 6, 7, 8};
        int target = 11;

        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println(numbers[left] + " + " + numbers[right] + " = " + target);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No two numbers found with sum = " + target);
        }
    }
}
