import org.junit.BeforeClass;
import org.junit.Test;

public class Problem1654Test {

    private static String longCode;

    @BeforeClass
    public static void setUp() throws Exception {
        StringBuilder stringBuilder = new StringBuilder("ven");
        for (int i=0; i<9990; i++) {
            stringBuilder.append("aa");
        }
        stringBuilder.append("digo\n");
        longCode = stringBuilder.toString();
    }

    @Test
    public void longTest() throws Exception {
        String expectedOutput = "vendigo";
        TestHelper.testSolution(longCode, expectedOutput, Problem1654.class);
    }

    @Test
    public void test1() throws Exception {
        String input = "wwstdaadierfflitzzz\n";
        String expectedOutput = "stierlitz";
        TestHelper.testSolution(input, expectedOutput, Problem1654.class);
    }

    @Test
    public void test2() throws Exception {
        String input = "veeerssrndiifgjjiigfihhiigo\n";
        String expectedOutput = "vendigo";
        TestHelper.testSolution(input, expectedOutput, Problem1654.class);
    }
}
