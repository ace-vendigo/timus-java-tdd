import java.io.*;

public class Template {

    StreamTokenizer reader;
    PrintWriter writer;

    public Template(StreamTokenizer reader, PrintWriter writer) {
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

    public static void main(String[] args) throws IOException {
        //Don't forget change Template to your class
        new Template(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    /*Start of the solution*/
    public void solve() throws IOException {
        //Write your solution here
        writer.flush();
    }
}
