import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int[] size : sizes) {
            int max = Arrays.stream(size).max().getAsInt();
            int min = Arrays.stream(size).min().getAsInt();
            maxW = Math.max(maxW, max);
            maxH = Math.max(maxH, min);
        }

        return maxW * maxH;
    }
}