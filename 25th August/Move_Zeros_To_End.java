
import java.util.Arrays;

public class Move_Zeros_To_End {

    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;

                nonzero++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Move_Zeros_To_End obj = new Move_Zeros_To_End();
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
