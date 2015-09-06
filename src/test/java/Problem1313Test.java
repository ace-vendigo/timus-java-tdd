import org.junit.Test;

public class Problem1313Test {
    @Test
    public void test1() throws Exception {
        String input = "3\n" +
                "1 2 3\n" +
                "4 5 6\n" +
                "7 8 9\n";
        String expectedOutput = "1 4 2 7 5 3 8 6 9";
        TestHelper.testSolution(input, expectedOutput, Problem1313.class);
    }

    @Test
    public void test2() throws Exception {
        String input = "4\n" +
                "1 3 6 10\n" +
                "2 5 9 13\n" +
                "4 8 12 15\n" +
                "7 11 14 16\n";
        String expectedOutput = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16";
        TestHelper.testSolution(input, expectedOutput, Problem1313.class);
    }
}
