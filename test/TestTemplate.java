import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestTemplate {

    //Use test like this to check whether your program return right results for some input data.
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
