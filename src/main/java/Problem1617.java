import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Problem1617 {
    StreamTokenizer reader;
    PrintWriter writer;

    public Problem1617(StreamTokenizer reader, PrintWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    int readInt() throws IOException {
        reader.nextToken();
        return (int) reader.nval;
    }

    public static void main(String[] args) throws IOException {
        new Problem1617(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }

    /*Start of the solution*/
    public void solve() throws IOException {
        //TODO Rewrite to streams/lambdas
        int count = readInt();
        Collection<Integer> wheels = readWheels(count);
        Map<Integer, Integer> wheelsBySize = groupWheelsBySize(wheels);
        int result = countWheelPairs(wheelsBySize);

        writer.println(result);
        writer.flush();
    }

    private int countWheelPairs(Map<Integer, Integer> wheelsBySize) {
        int r = 0;

        for (Integer sizeCount : wheelsBySize.values()) {
            r+=sizeCount/4;
        }

        return r;
    }

    private Map<Integer, Integer> groupWheelsBySize(Collection<Integer> wheels) {
        Map<Integer, Integer> wheelsBySize = new HashMap<>();

        for (Integer wheel : wheels) {
            Integer sizeCount = wheelsBySize.get(wheel);
            sizeCount = sizeCount==null?1:sizeCount+1;
            wheelsBySize.put(wheel, sizeCount);
        }

        return wheelsBySize;
    }

    private Collection<Integer> readWheels(int count) throws IOException {
        Collection<Integer> wheels = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            wheels.add(readInt());
        }
        return wheels;
    }
}
