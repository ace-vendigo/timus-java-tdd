import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class Problem1639Test {

    @Test
    public void testFirst() throws IOException {
        String input = "2 2";
        String actualOutput = runSolution(input);
        String expectedOutput = "[:=[first]";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSecond() throws IOException {
        String input = "1 3";
        String actualOutput = runSolution(input);
        String expectedOutput = "[second]=:]";
        assertEquals(expectedOutput, actualOutput);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Problem1639.Solution sol = new Problem1639.Solution(st, pw);
        sol.solve();
        return sw.toString();
    }
}
