import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestProblem1000 {

    @Test
    public void testSolution() throws IOException {
        String input = "10 20";
        String actualOutput = runSolution(input);
        String expectedOutput = "30";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution2() throws IOException {
        String input = "100 211";
        String actualOutput = runSolution(input);
        String expectedOutput = "311";
        assertEquals(expectedOutput, actualOutput);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Problem1000.Solution sol = new Problem1000.Solution(st, pw);
        sol.solve();
        return sw.toString();
    }
}
