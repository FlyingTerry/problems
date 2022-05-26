package cf;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/50/A
 */
public class T50ADominoPiling {
    public static void main(String[] args) {
        handle();
    }

    private static void handle() {
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int width = sc.nextInt();
        int ret = 0;
        ret += high / 2 * width;
        if (high % 2 == 1) {
            ret += width/2;
        }
        System.out.println(ret);
    }
}
