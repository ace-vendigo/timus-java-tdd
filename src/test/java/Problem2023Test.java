import org.junit.Test;

public class Problem2023Test {
    @Test
    public void test1() throws Exception {
        String input = "4\n" +
                "Aurora\n" +
                "Tiana\n" +
                "Ariel\n"+
                "Mulan\n";
        String expectedOutput = "5";
        TestHelper.testSolution(input, expectedOutput, Problem2023.class);
    }

    @Test
    public void test2() throws Exception {
        String input = "9\n" +
                       "Aurora\n" +
                       "Tiana\n" +
                       "Ariel\n"+
                       "Mulan\n"+
                       "Kuzko\n"+
                       "Ralph\n"+
                       "Tiana\n"+
                       "Peter\n"+
                       "Robin\n";
        String expectedOutput = "12";
        TestHelper.testSolution(input, expectedOutput, Problem2023.class);
    }

    @Test
    public void testWrongName() throws Exception {
        String input = "9\n" +
                "Aurora\n" +
                "Tiana\n" +
                "Ariel\n"+
                "Mulan\n"+
                "Kuzko\n"+
                "Dima\n"+
                "Ralph\n"+
                "Tiana\n"+
                "Peter\n"+
                "Robin\n";
        String expectedOutput = "12";
        TestHelper.testSolution(input, expectedOutput, Problem2023.class);
    }
}
