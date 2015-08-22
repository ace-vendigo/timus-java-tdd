import java.io.*;

//Status: Accepted
public class Problem2001 {
    static class Solution {
        void solve() throws IOException {
            int a1 = readInt();
            int b1 = readInt();
            int a2 = readInt();
            int b2 = readInt();
            int a3 = readInt();
            int b3 = readInt();

            int z1 = a1 - a3;
            int z2 = b1 - b2;

            writer.print(z1+" "+z2+"\n");
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
