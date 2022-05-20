package cf;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/71/A
 */
public class T71AWayTooLongWords {
    public static void main(String[] args) {
        handle();
    }

    private static void handle() {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.next());
        for (int i = 0; i < cnt; i++) {
            String word = sc.next();
            if (word.length() > 10) {
                System.out.println(""+word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
