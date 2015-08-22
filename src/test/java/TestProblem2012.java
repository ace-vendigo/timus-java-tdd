import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestProblem2012 {
    @Test
    public void testSolution1() throws IOException {
        String input = "7\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "YES\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution2() throws IOException {
        String input = "5\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "NO\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution3() throws IOException {
        String input = "10\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "YES\n";
        assertEquals(expectedOutput, actualOutput);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Problem2012.Solution sol = new Problem2012.Solution(st, pw);
        sol.solve();
        return sw.toString();
    }
}
