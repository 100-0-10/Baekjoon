import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static String AAAA = "AAAA";
    static String BB = "BB";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".", true);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (".".equals(str)) {
                sb.append(str);
            } else {
                int size = str.length();
                int aSize = size/4;
                int bSize = (size%4)/2;
                if ((size%4) % 2 != 0) {
                    sb = new StringBuilder();
                    sb.append(-1);
                    break;
                }
                sb.append(AAAA.repeat(aSize)).append(BB.repeat(bSize));
            }
        }

        System.out.println(sb);
    }
}