package cf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T158ANextRound {
    public static void main(String[] args) {
        handle();
    }

    private static void handle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int kScore = list.get(k - 1);
        int ret = list.stream()
                .filter(x -> x >= kScore && x > 0)
                .collect(Collectors.toList())
                .size();
        System.out.println(ret);
    }
}
