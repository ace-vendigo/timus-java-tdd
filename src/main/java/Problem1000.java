import java.io.*;

public class Problem1000 {

    StreamTokenizer reader;
    PrintWriter writer;

    public Problem1000(StreamTokenizer reader, PrintWriter writer) {
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
        int a = readInt();
        int b = readInt();
        int c = a + b;
        writer.print(c);
        writer.flush();
    }
}
