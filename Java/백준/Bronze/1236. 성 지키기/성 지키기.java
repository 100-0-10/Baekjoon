import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] xArr = new String[N][M];
        String[][] yArr = new String[N][M];
        int xGuardCount = 0;
        int yGuardCount = 0;

        for (int i = 0; i < N; i++) {
            String str = new StringTokenizer(br.readLine()).nextToken();
            for (int j = 0; j < M; j++) {
                xArr[i][j] = String.valueOf(str.charAt(j));
                yArr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            boolean hasGuard = false;
            for (int j = 0; j <M; j++) {
                if (".".equals(xArr[i][j])) {
                    if (j == M-1 && !hasGuard) {
                        xGuardCount++;
                        for (int k = 0; k < M; k++) {
                            xArr[i][k] = "X";
                        }
                    }
                } else {
                    hasGuard = true;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            boolean hasGuard = false;
            for (int j = 0; j < N; j++) {
                if (".".equals(yArr[j][i])) {
                    if (j == N-1 && !hasGuard) {
                        yGuardCount++;
                        for (int k = 0; k < N; k++) {
                            yArr[k][i] = "X";
                        }
                    }
                } else {
                    hasGuard = true;
                }
            }
        }

        System.out.println(Math.max(xGuardCount, yGuardCount));
    }
}