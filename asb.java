import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'performOperations' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER_ARRAY op
     */

    public static List<Long> performOperations(int N, List<Integer> op) {
    // Write your code here
    // List<Long> s;
    System.out.println(op);
        // return s;
    }

}

public class asb {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int M = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> op = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // List<Long> result =
         Result.performOperations(N, op);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("&#039;\n&#039;"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
