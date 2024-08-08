import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int YPay = 0;
        int MPay = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(st.nextToken());

            YPay += ((M / 30) + 1) * 10;
            MPay += ((M / 60) + 1) * 15;
        }

        if (YPay > MPay) {
            sb.append("M ").append(MPay);
        } else if (YPay < MPay) {
            sb.append("Y ").append(YPay);
        } else {
            sb.append("Y M ").append(MPay);
        }

        System.out.println(sb);
    }
}