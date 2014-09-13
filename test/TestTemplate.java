import org.junit.Ignore;
import org.junit.Test;

import java.io.*;
import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;

public class TestTemplate {

    @Test
    public void test() throws IOException {
        String input = "";
        String actualOutput = runSolution(input);
        String expectedOutput = "";
        assertEquals(expectedOutput, actualOutput);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Template.Solution sol = new Template.Solution(st, pw);
        sol.solve();
        return pw.toString();
    }
}
