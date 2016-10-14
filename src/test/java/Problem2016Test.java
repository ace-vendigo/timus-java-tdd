import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class Problem2016Test {
    @Test
    public void testSolution1() throws IOException {
        String input = "1\n" +
                       "2\n" +
                       "3\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "-5";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution2() throws IOException {
        String input = "0\n" +
                       "5\n" +
                       "6\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "-30";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution3() throws IOException {
        String input = "0\n" +
                       "0\n" +
                       "10\n";
        String actualOutput = runSolution(input);
        String expectedOutput = "-10";
        assertEquals(expectedOutput, actualOutput);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Problem2066 sol = new Problem2066(st, pw);
        sol.solve();
        return sw.toString();
    }
}
