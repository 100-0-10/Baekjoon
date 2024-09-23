import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> person = new HashMap<>();

        for (String p : participant) {
            person.put(p, person.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            person.put(c, person.get(c)-1);
        }

        return person.entrySet().stream().filter(p -> p.getValue() > 0).findFirst().get().getKey();
    }
}