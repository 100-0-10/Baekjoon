import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer firstSt = new StringTokenizer(br.readLine());
        StringTokenizer secondSt = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(secondSt.nextToken());
        int tCount = 0;
        for (int i = 0; i < 6; i++) {
            tCount += (int) Math.ceil(Double.parseDouble(firstSt.nextToken()) / T);
        }
        System.out.println(tCount);

        int P = Integer.parseInt(secondSt.nextToken());

        System.out.print(N / P + " " + N % P);
    }

}