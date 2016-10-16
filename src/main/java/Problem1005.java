import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.summingInt;

public class Problem1005 {

    StreamTokenizer reader;
    PrintWriter writer;

    public Problem1005(StreamTokenizer reader, PrintWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    int readInt() throws IOException {
        reader.nextToken();
        return (int) reader.nval;
    }

    public static void main(String[] args) throws IOException {
        new Problem1005(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    public void solve() throws IOException {
        int n = readInt();

        List<Integer> weights = new ArrayList<>();
        for (int i=0; i<n; i++) {
            weights.add(readInt());
        }

        weights.sort(Comparator.reverseOrder());

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        weights.forEach(elem -> {
            Integer leftSum = left.stream().collect(summingInt(Integer::valueOf));
            Integer rightSum = right.stream().collect(summingInt(Integer::valueOf));
            if (leftSum > rightSum) {
                right.add(elem);
            } else {
                left.add(elem);
            }

        });

        Integer leftSum = left.stream().collect(summingInt(Integer::valueOf));
        Integer rightSum = right.stream().collect(summingInt(Integer::valueOf));

        writer.print(Math.abs(leftSum - rightSum));
        writer.flush();
    }
}
