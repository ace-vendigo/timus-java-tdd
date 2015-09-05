import java.io.*;

public class Problem1313 {
    StreamTokenizer reader;
    PrintWriter writer;

    public Problem1313(StreamTokenizer reader, PrintWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    int readInt() throws IOException {
        reader.nextToken();
        return (int) reader.nval;
    }

    public static void main(String[] args) throws IOException {
        new Problem1313(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    /*Start of the solution*/
    int size;

    public void solve() throws IOException {
        int[][] matrix = readMatrix();
        writeLine(matrix);
        writer.flush();
    }

    private void writeLine(int[][] matrix) {
        int runCount = size * 2 - 1;

        for (int run = 0; run < runCount; run++) {
            int i = Math.min(run, size - 1);
            int j = Math.max(run - size, 0);
            int runLen = runLen(run);
            for (int pos = 0; pos < runLen; pos++) {
                writer.print(matrix[i][j]);
                printSpace(run, runCount, pos, runLen);
                i--;
                j++;
            }
        }
    }

    private void printSpace(int run, int runCount, int pos, int runLen) {
        if (run != runCount - 1 && pos != runLen - 1) {
            writer.print(" ");
        }
    }

    private int runLen(int run) {
        if (run <= size) {
            return run;
        } else {
            return 2 * size - run;
        }
    }

    private int[][] readMatrix() throws IOException {
        size = readInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][i] = readInt();
            }
        }

        return matrix;
    }
}
