import java.io.*;

//Status: Accepted
public class Problem2012 {
    static class Solution {
        void solve() throws IOException {
            int f =readInt();
            String answer = f>=7?"YES":"NO";

            writer.print(answer+"\n");
            writer.flush();
        }

        StreamTokenizer reader;
        PrintWriter writer;

        Solution(StreamTokenizer reader, PrintWriter writer) {
            this.reader = reader;
            this.writer = writer;
        }

        int readInt() throws IOException {
            reader.nextToken();
            return (int) reader.nval;
        }
    }

    public static void main(String[] args) throws IOException {
        new Solution(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }
}
