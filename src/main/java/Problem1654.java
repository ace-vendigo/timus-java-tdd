import java.io.*;
import java.util.LinkedList;

import static java.util.stream.Collectors.toCollection;

public class Problem1654 {

    StreamTokenizer reader;
    PrintWriter writer;

    public Problem1654(StreamTokenizer reader, PrintWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    String readLine() throws IOException {
        reader.nextToken();
        return reader.sval;
    }

    public static void main(String[] args) throws IOException {
        new Problem1654(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    public void solve() throws IOException {
        String code = readLine();
        LinkedList<Integer> charList = code.chars().boxed().collect(toCollection(LinkedList::new));

        int pos = 0;
        while (pos<charList.size()-1) {
            if (charList.get(pos).equals(charList.get(pos+1))) {
                charList.remove(pos);
                charList.remove(pos);
                if (pos != 0) pos--;
            } else {
                pos++;
            }
        }

        byte[] bytes = new byte[charList.size()];
        for (int i=0; i<charList.size(); i++) {
            bytes[i] = charList.get(i).byteValue();
        }

        writer.print(new String(bytes));
        writer.flush();
    }
}
