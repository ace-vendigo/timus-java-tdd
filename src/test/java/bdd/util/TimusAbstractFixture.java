package bdd.util;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TimusAbstractFixture {
    public String run(String problemName, String input) throws Exception {
        String className = buildClassName(problemName);
        Class<?> problemClass = Class.forName(className);

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new StringReader(input)));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        Constructor<?> solutionConstructor = problemClass.getConstructor(StreamTokenizer.class, PrintWriter.class);
        Object solutionObject = solutionConstructor.newInstance(st, pw);
        Method solveMethod = problemClass.getDeclaredMethod("solve");
        solveMethod.invoke(solutionObject);
        return sw.toString();
    }

    private String buildClassName(String problemName) {
        String problemNumber = problemName.split("\\.")[0];
        return "Problem"+problemNumber;
    }
}
