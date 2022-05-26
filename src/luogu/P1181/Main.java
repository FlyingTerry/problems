package luogu.P1181;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            while (i < n && tmp + nums[i] <= m) {
//                System.out.println("tmp:"+tmp+" i:"+i+" nums[i]"+nums[i]);
                tmp+=nums[i];
                i++;
            }
//            System.out.println("到"+i+"卡了一次");
            ret+=1;
            if (i<n) {
                i--;
            }
        }
        System.out.println(ret);
    }
}
