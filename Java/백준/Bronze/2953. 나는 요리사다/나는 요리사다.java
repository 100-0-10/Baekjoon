import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int maxScore = 0;
        int cook = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int tot = 0;
            for (int j = 0; j < 4; j++) {
                tot += Integer.parseInt(st.nextToken());
            }

            if (tot > maxScore) {
                cook = i+1;
                maxScore = tot;
            }
        }

        sb.append(cook).append(" ").append(maxScore);

        System.out.print(sb);
    }
}