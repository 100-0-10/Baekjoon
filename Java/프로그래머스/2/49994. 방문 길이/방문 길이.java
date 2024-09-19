import java.util.*;

class Solution {
    public int solution(String dirs) {
        Map<Character, int[]> location = new HashMap<>();
        location.put('U', new int[] {0, 1});
        location.put('D', new int[] {0, -1});
        location.put('R', new int[] {-1, 0});
        location.put('L', new int[] {1, 0});

        int x = 5;
        int y = 5;
        Set<String> answer = new HashSet<>();

        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));

            int nx = x + offset[0];
            int ny = y + offset[1];

            if (!(0 <= nx && nx < 11 && 0 <= ny && ny < 11)) {
                continue;
            }

            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;
        }

        return answer.size() / 2;
    }
}