
import java.util.Arrays;

public class Array_Leaders {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maximumRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maximumRight;
            maximumRight = Math.max(maximumRight, current);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        Array_Leaders obj = new Array_Leaders();
        int[] result = obj.replaceElements(arr);
        System.out.print(Arrays.toString(result));
    }
}
