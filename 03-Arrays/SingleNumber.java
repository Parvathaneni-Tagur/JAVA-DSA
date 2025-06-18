import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        int x = brutForce(nums);
        System.out.println(" Brut Force " + x);
    }

    private static int brutForce(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (num == nums[j])
                    count++;
            }
            if (count == 1)
                return nums[i];
        }

        return -1;
    }
}
