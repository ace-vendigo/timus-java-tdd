import org.junit.Test;

public class Problem1617Test {
    @Test
    public void test1() throws Exception {
        String input = "9\n" +
                       "689\n" +
                       "690\n" +
                       "690\n" +
                       "689\n" +
                       "689\n" +
                       "690\n" +
                       "689\n" +
                       "688\n" +
                       "688";
        String expectedOutput = "1\r\n";
        TestHelper.testSolution(input, expectedOutput, Problem1617.class);
    }
}
