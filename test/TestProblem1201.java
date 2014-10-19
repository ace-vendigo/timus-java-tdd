import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestProblem1201 {

    @Test
    public void testSolution1() throws IOException {
        String input = "16 3 2002";
        String actualOutput = runSolution(input);
        String expectedOutput = "mon        4   11   18   25\n" +
                                "tue        5   12   19   26\n" +
                                "wed        6   13   20   27\n" +
                                "thu        7   14   21   28\n" +
                                "fri   1    8   15   22   29\n" +
                                "sat   2    9  [16]  23   30\n" +
                                "sun   3   10   17   24   31\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution2() throws IOException {
        String input = "1 3 2002";
        String actualOutput = runSolution(input);
        String expectedOutput = "mon        4   11   18   25\n" +
                                "tue        5   12   19   26\n" +
                                "wed        6   13   20   27\n" +
                                "thu        7   14   21   28\n" +
                                "fri [ 1]   8   15   22   29\n" +
                                "sat   2    9   16   23   30\n" +
                                "sun   3   10   17   24   31\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution3() throws IOException {
        String input = "20 10 2050";
        String actualOutput = runSolution(input);
        String expectedOutput =
                "mon        3   10   17   24   31\n" +
                "tue        4   11   18   25\n" +
                "wed        5   12   19   26\n" +
                "thu        6   13  [20]  27\n" +
                "fri        7   14   21   28\n" +
                "sat   1    8   15   22   29\n" +
                "sun   2    9   16   23   30\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSolution4() throws IOException {
        String input = "4 7 1890";
        String actualOutput = runSolution(input);
        String expectedOutput =
                "mon        7   14   21   28\n" +
                "tue   1    8   15   22   29\n" +
                "wed   2    9   16   23   30\n" +
                "thu   3   10   17   24   31\n" +
                "fri [ 4]  11   18   25\n" +
                "sat   5   12   19   26\n" +
                "sun   6   13   20   27\n";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void watchSolution1() throws IOException {
        String input = "19 10 2014";
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
