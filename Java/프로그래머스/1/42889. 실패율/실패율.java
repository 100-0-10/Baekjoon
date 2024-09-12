import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challengers = new int[N+2];
        for (int stage : stages) {
            challengers[stage]++;
        }

        Map<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        for (int i = 1; i <= N; i++) {
            if (challengers[i] == 0) {
                fails.put(i, 0.);
            } else {
                fails.put(i, challengers[i] / total);
                total -= challengers[i];
            }
        }

        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(Map.Entry::getKey).toArray();
    }
}