import org.junit.Test;


public class Problem1319Test {
    @Test
    public void test1() throws Exception {
        String input = "2";
        String expectedOutput = "2 1\r\n"+
                                "4 3\r\n";
        TestHelper.testSolution(input, expectedOutput, Problem1319.class);
    }

    @Test
    public void test2() throws Exception {
        String input = "3";
        String expectedOutput = "4 2 1\r\n"+
                                "7 5 3\r\n" +
                                "9 8 6\r\n";
        TestHelper.testSolution(input, expectedOutput, Problem1319.class);
    }

    @Test
    public void test3() throws Exception {
        String input = "4";
        String expectedOutput = "7 4 2 1\r\n"+
                                "11 8 5 3\r\n" +
                                "14 12 9 6\r\n" +
                                "16 15 13 10\r\n";
        TestHelper.testSolution(input, expectedOutput, Problem1319.class);
    }
}
