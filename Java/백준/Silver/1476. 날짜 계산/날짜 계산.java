import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int earth = 1;
        int sun = 1;
        int moon = 1;
        int year = 1;

        while (E != earth || S != sun || M != moon) {
            earth++;
            sun++;
            moon++;
            year++;

            if (earth > 15) {
                earth = 1;
            }
            if (sun > 28) {
                sun = 1;
            }
            if (moon > 19) {
                moon = 1;
            }
        }

        System.out.println(year);
    }
}