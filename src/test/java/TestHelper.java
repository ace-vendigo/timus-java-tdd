import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class TestHelper {

    public static void testSolution(String input, String expectedOutput, Class<?> solutionClass) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Constructor<?> solutionConstructor = solutionClass.getConstructor(StreamTokenizer.class, PrintWriter.class);
        Object solutionObject = solutionConstructor.newInstance(st, pw);
        Method solveMethod = solutionClass.getDeclaredMethod("solve");
        solveMethod.invoke(solutionObject);

        assertEquals(sw.toString(), expectedOutput);
    }
}
