import org.junit.Test;

public class Problem1005Test {
    @Test
    public void test1() throws Exception {
        String input = "5\n" +
                       "5 8 13 27 14\n";
        String expectedOutput = "3";
        TestHelper.testSolution(input, expectedOutput, Problem1005.class);
    }

    @Test
    public void test2() throws Exception {
        String input = "5\n" +
                "2 98 50 25 25\n";
        String expectedOutput = "0";
        TestHelper.testSolution(input, expectedOutput, Problem1005.class);
    }

    @Test
    public void test3() throws Exception {
        String input = "4\n" +
                "100 100 100 1000\n";
        String expectedOutput = "700";
        TestHelper.testSolution(input, expectedOutput, Problem1005.class);
    }

    @Test
    public void test4() throws Exception {
        String input = "1\n" +
                "225\n";
        String expectedOutput = "225";
        TestHelper.testSolution(input, expectedOutput, Problem1005.class);
    }

    @Test
    public void test5() throws Exception {
        String input = "2\n" +
                "100 2\n";
        String expectedOutput = "98";
        TestHelper.testSolution(input, expectedOutput, Problem1005.class);
    }
}
