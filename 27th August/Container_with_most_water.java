
import java.util.*;

public class Container_with_most_water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of heights: ");
        int n = sc.nextInt();
        int[] h = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(h[left], h[right]);
            maxArea = Math.max(maxArea, width * minHeight);

            if (h[left] < h[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum area: " + maxArea);
        sc.close();
    }
}
