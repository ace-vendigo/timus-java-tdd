import java.io.*;

public class Problem1319 {
    StreamTokenizer reader;
    PrintWriter writer;

    public Problem1319(StreamTokenizer reader, PrintWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    int readInt() throws IOException {
        reader.nextToken();
        return (int) reader.nval;
    }

    public static void main(String[] args) throws IOException {
        new Problem1319(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    /*Start of the solution*/
    public void solve() throws IOException {
        int size = readInt();
        int[][] m = buildMatrix(size);
        outputMatrix(m, size);
        writer.flush();
    }

    private int[][] buildMatrix(int size) {
        int[][] m =  new int[size][size];

        int runCount = size * 2 - 1;
        int cellNum = 1;

        for (int run = 0; run < runCount; run++) {
            int i = Math.max(0, run - size + 1);
            int j = Math.max(0, size - run - 1);
            int runLen = runLen(run, size);
            for (int pos = 0; pos < runLen; pos++) {
                m[i][j] = cellNum;
                i++;
                j++;
                cellNum++;
            }
        }

        return m;
    }

    private void outputMatrix(int[][] m, int size) {
        for (int i = 0; i<size; i++) {
            for (int j = 0; j<size; j++) {
                writer.print(m[i][j]);
                if (j<size-1) {
                    writer.print(" ");
                }
            }
            writer.println();
        }
    }

    private int runLen(int run, int size) {
        if (run < size) {
            return run+1;
        } else {
            return 2 * size - run - 1;
        }
    }
}
