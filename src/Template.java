import java.io.*;

public class Template {

    static class Solution {
        void solve() throws IOException {
            //Put your solution here. Use readLine, readInt and readDouble for input
            // and writer.print for output. Don't forget call writer.flush at the end.
            writer.flush();
        }

        StreamTokenizer reader;
        PrintWriter writer;

        Solution(StreamTokenizer reader, PrintWriter writer) {
            this.reader = reader;
            this.writer = writer;
        }

        String readLine() throws IOException {
            reader.nextToken();
            return reader.sval;
        }

        int readInt() throws IOException {
            reader.nextToken();
            return (int) reader.nval;
        }

        double readDouble() throws IOException {
            reader.nextToken();
            return (double) reader.nval;
        }
    }

    public static void main(String[] args) throws IOException {
        new Solution(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }
}
