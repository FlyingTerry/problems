package luogu.B2004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        String ret = String.format("%8d %8d %8d", nums[0], nums[1], nums[2]);
        System.out.println(ret);
    }
}
