package lc.lc1229;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
    }

    public static List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        List<Integer> ret = new ArrayList<>();
        List<int[]> c1 = Arrays.stream(slots1).filter(x -> x[1] - x[0] >= duration).sorted(Comparator.comparingInt(a -> a[0])).collect(Collectors.toList());
        List<int[]> c2 = Arrays.stream(slots2).filter(x -> x[1] - x[0] >= duration).sorted(Comparator.comparingInt(a -> a[0])).collect(Collectors.toList());
        for (int[] item : c1) {
            int[] tmp = c2.stream()
                    .filter(x -> {
                        int begin = Math.max(item[0], x[0]);
                        int end = begin+duration;
                        return item[1]>=end && x[1]>=end;
                    })
                    .findFirst()
                    .orElse(null);

            if (Objects.nonNull(tmp)) {
                int begin = Math.max(item[0], tmp[0]);
                int end = begin+duration;
                ret.add(begin);
                ret.add(end);
                return ret;
            }
        }
        return ret;
    }
}
