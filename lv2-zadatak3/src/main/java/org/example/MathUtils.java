package org.example;

import java.util.List;

/**
 * util class for some math functions
 */

public class MathUtils {
    /**
     * get minimal element from List
     * @param numbers
     * @return
     */
    public static Double min(List<Double> numbers) {
        double min = Double.MAX_VALUE;
        for (Double num : numbers) {
            if (num.doubleValue() < min) {
                min = num.doubleValue();
            }
        }
        return min;
    }
    // mozda je moglo ovako nmp
    public static Double mi2n(List<Double> numbers) {
        Double min = Double.MAX_VALUE;
        for (Double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    /**
     * get maximal element from List
     * @param numbers
     * @return
     */
    public static Double max(List<Double> numbers) {
        double max = Double.MIN_VALUE;
        for (Double number : numbers) {
            if (number.doubleValue() > max) {
                max = number.doubleValue();
            }
        }
        return max;
    }

    /**
     * calculates mean from numbers in the List (parameter)
     * @param numbers
     * @return
     */
    public static Double mean(List<Double> numbers) {
        double sum = 0;
        for (Double number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    /**
     * calculates std deviation using formula sqrt(sum(Xi - mean)^2 / N)
     * @param numbers
     * @return
     */
    public static Double stddev(List<Double> numbers) {
        Double mean = MathUtils.mean(numbers);
        double standardDeviation = 0;
        for (Double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / numbers.size());
    }
}





















