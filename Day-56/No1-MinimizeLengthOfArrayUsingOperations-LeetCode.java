import java.util.Arrays;

public class Solution {
    public int minimumArrayLength(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        int c = 1, g = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            g = Math.min(g, gcd(v[i], v[i - 1]));
            if (g < v[0])
                return 1;
            if (v[i] == v[0])
                c++;
        }
        int k = (int) Math.ceil(c / (2.0));
        return k;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
