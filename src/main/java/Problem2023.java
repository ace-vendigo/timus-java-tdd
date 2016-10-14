import java.io.*;
import java.util.*;

public class Problem2023 {

    StreamTokenizer reader;
    PrintWriter writer;

    public Problem2023(StreamTokenizer reader, PrintWriter writer) {
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

    public static void main(String[] args) throws IOException {
        new Problem2023(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    public void solve() throws IOException {
        int count = readInt();
        List<String> names = new ArrayList<>();
        for (int i=0; i<count; i++) {
            names.add(readLine());
        }

        Map<String, Integer> boxes = new HashMap<>();
        String[] box1 = {"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"};
        String[] box2 = {"Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"};
        String[] box3 = {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"};
        Arrays.stream(box1).forEach(name -> boxes.put(name, 1));
        Arrays.stream(box2).forEach(name -> boxes.put(name, 2));
        Arrays.stream(box3).forEach(name -> boxes.put(name, 3));

        int sum = 0;
        int prevPosition = 1;

        for (String name : names) {
            if (!boxes.containsKey(name)) {
                throw new RuntimeException();
            }
            int currentPosition = boxes.get(name);
            sum += Math.abs(currentPosition - prevPosition);
            prevPosition = currentPosition;
        }

        writer.print(sum);
        writer.flush();
    }
}
