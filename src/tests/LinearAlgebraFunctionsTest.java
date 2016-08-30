import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by mcmellawatt on 8/29/16.
 */
public class LinearAlgebraFunctionsTest {

    @Test
    public void scalarMultiply() {
        Double scalar = 7.41;
        Double[] inputEntries = {1.671, -1.012, -0.318};
        Vector<Double> input = new Vector<>(Arrays.asList(inputEntries));
        Double[] expectedResultEntries = {12.38211,-7.49892,-2.35638};
        Vector<Double> expectedResult = new Vector<>(Arrays.asList(expectedResultEntries));

        Vector<Double> actualResult = LinearAlgebraFunctions.scalarMultiply(scalar, input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void add() {
        Double[] leftEntries = {8.218,-9.341};
        Vector<Double> left = new Vector<>(Arrays.asList(leftEntries));
        Double[] rightEntries = {-1.129, 2.111};
        Vector<Double> right = new Vector<>(Arrays.asList(rightEntries));
        Double[] expectedResultEntries = {7.089, -7.229999999999999};
        Vector<Double> expectedResult = new Vector<>(Arrays.asList(expectedResultEntries));

        Vector<Double> actualResult = LinearAlgebraFunctions.add(left, right);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtract() {
        Double[] leftEntries = {7.119, 8.215};
        Vector<Double> left = new Vector<>(Arrays.asList(leftEntries));
        Double[] rightEntries = {-8.223, 0.878};
        Vector<Double> right = new Vector<>(Arrays.asList(rightEntries));
        Double[] expectedResultEntries = {15.342, 7.337};
        Vector<Double> expectedResult = new Vector<>(Arrays.asList(expectedResultEntries));

        Vector<Double> actualResult = LinearAlgebraFunctions.subtract(left, right);
        Assert.assertEquals(actualResult, expectedResult);
    }

}