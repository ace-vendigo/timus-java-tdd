import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestProblem1201 {

    @Ignore
    @Test
    public void testSolution1() throws IOException {
        String input = "16 3 2002";
        String actualOutput = runSolution(input);
        String expectedOutput = "mon........4...11...18...25\n" +
                                "tue........5...12...19...26\n" +
                                "wed........6...13...20...27\n" +
                                "thu........7...14...21...28\n" +
                                "fri...1....8...15...22...29\n" +
                                "sat...2....9..[16]..23...30\n" +
                                "sun...3...10...17...24...31";
        assertEquals(expectedOutput, actualOutput);
    }

    @Ignore
    @Test
    public void testSolution2() throws IOException {
        String input = "1 3 2002";
        String actualOutput = runSolution(input);
        String expectedOutput = "mon........4...11...18...25\n" +
                                "tue........5...12...19...26\n" +
                                "wed........6...13...20...27\n" +
                                "thu........7...14...21...28\n" +
                                "fri.[.1]...8...15...22...29\n" +
                                "sat...2....9...16...23...30\n" +
                                "sun...3...10...17...24...31";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void watchSolution1() throws IOException {
        String input = "16 3 2002";
        String output = runSolution(input);
        System.out.println("input:\n"+input+"\noutput: \n"+output);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Problem1201.Solution sol = new Problem1201.Solution(st, pw);
        sol.solve();
        return sw.toString();
    }
}
