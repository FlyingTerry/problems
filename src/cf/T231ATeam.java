package cf;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/231/A
 */
public class T231ATeam {
    public static void main(String[] args) {
        handle();
    }

    private static void handle() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int ret = 0;
        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c > 1) {
                ret++;
            }
        }
        System.out.println(ret);
    }
}
