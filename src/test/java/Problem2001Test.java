import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class Problem2001Test {

    @Test
    public void testSolution1() throws IOException {
        String input = "1 2\n" +
                       "2 1\n" +
                       "0 3\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "1 1\n";
        assertEquals(expectedOutput, actualOutput);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Problem2001.Solution sol = new Problem2001.Solution(st, pw);
        sol.solve();
        return sw.toString();
    }
}
