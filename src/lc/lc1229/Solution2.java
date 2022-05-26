package lc.lc1229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {

    public List<Integer> minAvailableDuration(int[][] aa, int[][] bb, int duration) {
        List<Integer> res = new ArrayList<>();
        List<int[]> c1 = Arrays.stream(aa).filter(x -> x[1] - x[0] >= duration).sorted(Comparator.comparingInt(a -> a[0])).collect(Collectors.toList());
        List<int[]> c2 = Arrays.stream(bb).filter(x -> x[1] - x[0] >= duration).sorted(Comparator.comparingInt(a -> a[0])).collect(Collectors.toList());

        int left = 0;
        int right = 0;
        while (left < c1.size() && right < c2.size()) {
            int l, r;
            l = Math.max(c1.get(left)[0], c2.get(right)[0]);
            r = Math.min(c1.get(left)[1], c2.get(right)[1]);
            if (r - l >= duration) {
                res.add(l);
                res.add(l + duration);
                return res;
            }
            if (c1.get(left)[1] < c2.get(right)[1]) {
                left++;
            } else {
                right++;
            }
        }
        return res;
    }
}
