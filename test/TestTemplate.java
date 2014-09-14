import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestTemplate {

    //Використовуйте подібні тести для перевірки правильності роботи вашої програми.
    @Test
    public void testSolution1() throws IOException {
        String input = "input";
        String actualOutput = runSolution(input);
        String expectedOutput = "output";
        assertEquals(expectedOutput, actualOutput);
    }

    //Анотація @Ignore вказує які тести не потрібно виконувати
    @Ignore
    @Test
    public void testSolution2() throws IOException {
        String input = "input";
        String actualOutput = runSolution(input);
        String expectedOutput = "output";
        assertEquals(expectedOutput, actualOutput);
    }

    //Цей тест нічого не перевіряє, а просто дозволяє вам подивитися на вивід для конкретних вхідних даних.
    @Test
    public void watchSolution1() throws IOException {
        String input = "input example"; //Тут вставте свої вхідні дані.
        String output = runSolution(input);
        System.out.println("input:\n"+input+"\noutput: \n"+output);
    }

    private String runSolution(String input) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Template.Solution sol = new Template.Solution(st, pw); //Не забудьте замінити клас Template.Solution на свій ProblemXXX.Solution
        sol.solve();
        return sw.toString();
    }
}
