package luogu.P1007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            int thisMin = Math.min(position, l - position+1);
            int thisMax = Math.max(position, l - position+1);
            min = Math.max(min, thisMin);
            max = Math.max(max, thisMax);
//            min = Math.max(min, Math.min(position, l - position));
//            max = Math.max(max, Math.max(position, l - position));
        }
        System.out.println(min+" "+max);
    }
}
