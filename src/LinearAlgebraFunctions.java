import java.util.Vector;

/**
 * Created by mcmellawatt on 8/29/16.
 */
public class LinearAlgebraFunctions {
    public static Vector<Double> scalarMultiply(Double scalar, Vector<Double> input) {
        if (input == null) {
            throw new NullPointerException("Input vector must not be null");
        }

        Vector<Double> result = new Vector<>();
        for (int i = 0; i < input.size(); ++i) {
            result.add(scalar * input.elementAt(i));
        }

        return result;
    }

    public static Vector<Double> add(Vector<Double> left, Vector<Double> right) {
        if (left == null || right == null) {
            throw new NullPointerException("Left and right vectors must not be null");
        }

        if (left.size() != right.size()) {
            throw new IllegalArgumentException("Cannot add a vector of size" + left.size() + "to a vector of size" + right.size());
        }

        Vector<Double> result = new Vector<>();
        for (int i = 0; i < left.size(); ++i) {
            result.add(left.elementAt(i) + right.elementAt(i));
        }

        return result;
    }

    public static Vector<Double> subtract(Vector<Double> left, Vector<Double> right) {
        if (left == null || right == null) {
            throw new NullPointerException("Left and right vectors must not be null");
        }

        if (left.size() != right.size()) {
            throw new IllegalArgumentException("Cannot subtract a vector of size" + left.size() + "to a vector of size" + right.size());
        }

        Vector<Double> result = new Vector<>();
        for (int i = 0; i < left.size(); ++i) {
            result.add(left.elementAt(i) - right.elementAt(i));
        }

        return result;
    }
}
