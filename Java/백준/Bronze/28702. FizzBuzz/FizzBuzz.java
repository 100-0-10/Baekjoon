import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();
        int fourth = 0;

        if (isNumeric(first)) {
            fourth = Integer.parseInt(first) + 3;
        } else if (isNumeric(second)) {
            fourth = Integer.parseInt(second) + 2;
        } else if (isNumeric(third)) {
            fourth = Integer.parseInt(third) + 1;
        }

        if (fourth % 3 == 0 && fourth % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (fourth % 3 == 0) {
            System.out.println("Fizz");
        } else if (fourth % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(fourth);
        }

    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

}