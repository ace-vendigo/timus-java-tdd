import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.naturalOrder;

public class Problem2066 {

    StreamTokenizer reader;
    PrintWriter writer;

    public Problem2066(StreamTokenizer reader, PrintWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    int readInt() throws IOException {
        reader.nextToken();
        return (int) reader.nval;
    }

    public static void main(String[] args) throws IOException {
        new Problem2066(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    public void solve() throws IOException {
        int a = readInt();
        int b = readInt();
        int c = readInt();

        List<Integer> results = new ArrayList<>();
        results.add(a*b-c);
        results.add(a*c-b);
        results.add(b*c-a);

        results.add(a-b*c);
        results.add(b-a*c);
        results.add(c-a*b);

        results.add(c-a-b);
        results.add(a-b-c);
        results.add(b-a-c);

        Optional<Integer> min = results.stream().min(naturalOrder());
        writer.print(min.get());
        writer.flush();
    }
}
