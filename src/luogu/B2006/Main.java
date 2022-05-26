package luogu.B2006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int y = sc.nextInt();
        int b = sc.nextInt();
        double ret = (b * y - a * x) * 1.0d / (b - a);
        System.out.println(String.format("%.2f",ret));
    }
}
