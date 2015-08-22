import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestTemplate {

    public void testSolution1() throws IOException {
        String input = "input";
        String actualOutput = runSolution(input);
        String expectedOutput = "output";
        assertEquals(expectedOutput, actualOutput);
    }

    public void testSolution2() throws IOException {
        String input = "input";
        String actualOutput = runSolution(input);
        String expectedOutput = "output";
        assertEquals(expectedOutput, actualOutput);
    }

    public void watchSolution1() throws IOException {
        String input = "input example";
        String output = runSolution(input);
        System.out.println("input:\n" + input + "\noutput: \n" + output);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        //Don't forget to change ua.com.vendigo.Template.Solution to ProblemXXX.Solution
        Template.Solution sol = new Template.Solution(st, pw);
        sol.solve();
        return sw.toString();
    }
}
