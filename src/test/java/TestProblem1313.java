import org.junit.Test;

public class TestProblem1313 {
    @Test
    public void test1() throws Exception {
        String input = "3\n" +
                "1 2 3\n" +
                "4 5 6\n" +
                "7 8 9\n";
        String expectedOutput = "1 4 2 7 5 3 8 6 9";
        TestHelper.testSolution(input, expectedOutput, Problem1313.class);
    }
}
