package lc.lc5;

public class Manacher {
    public static void main(String[] args) {
        Manacher manacher = new Manacher();
        System.out.println(manacher.longestPalindrome("abbcccbbbcaaccbababcbcabca"));
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        String input = getStr(s, '#');
        int[] record = new int[input.length()];

        //记录某个点处的臂长
        record[0]=1;

        int recordRight = 0;
        int recordMid = 0;
        int maxLen = 0;
        int maxMid = 0;

        for (int i = 0; i < input.length(); i++) {
            int tmp = 0;
            if (recordRight > i) {
                int point = recordMid * 2 - recordRight;
                tmp = Math.min(recordRight - i+1, record[point]);
            }
            int len = expand(input, i-tmp, i+tmp );
            record[i]=len/2;
            if (len > maxLen) {
                maxLen = len;
                maxMid = i;
            }

            if (i + len / 2 > recordRight) {
                recordRight = i+len/2;
                recordMid = i;
            }
        }

        int start = maxMid-record[maxMid]+1;
        int end = maxMid+record[maxMid];
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <end; i++) {
            if (input.charAt(i) == '#') {
                continue;
            }
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }

    public String getStr(String s, char ch) {
        StringBuilder builder = new StringBuilder();
        char c = '#';
        builder.append(c);
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            builder.append(c);
        }
        return builder.toString();
    }

    public int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
