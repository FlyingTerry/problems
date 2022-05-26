package lc.lc11;

public class Solution {
    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length-1;
        while (left < right) {
            int tmp = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(tmp, max);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
