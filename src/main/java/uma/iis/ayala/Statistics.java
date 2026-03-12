package uma.iis.ayala;

import org.apache.commons.math3.stat.StatUtils;

/** Class including some statistics methods for arrays of numbers */
public class Statistics {

  /**
   * This method returns the maximum value of an array of doubles
   * @param arrayOfNumbers The array of doubles
   * @return The maximum value of the array
   */
  public double maximumValue(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double max = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] > max) {
        max = arrayOfNumbers[i];
      }
    }
    return max;
  }

  /**
   * This parameter returns the minimum value of an array of doubles
   * @param arrayOfNumbers The array of doubles
   * @return The minimum value of the array
   */
  public double minimumValue(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double min = arrayOfNumbers[0];
    for (int i = 1; i < arrayOfNumbers.length; i++) {
      if (arrayOfNumbers[i] < min) {
        min = arrayOfNumbers[i];
      }
    }
    return min;
  }

  /**
   * This parameter returns the average of an array of doubles
   * @param arrayOfNumbers The array of doubles
   * @return The value of the average of the array
   */
  public double mean(double[] arrayOfNumbers) {
    if (arrayOfNumbers.length == 0) {
      throw new IllegalArgumentException("Array must not be empty");
    }
    double sum = 0.0;
    for (double num : arrayOfNumbers) {
      sum += num;
    }
    return sum / arrayOfNumbers.length;
  }

  /**
   * This parameter returns the value of the median of an array of doubles
   * @param arrayOfNumbers The array of doubles
   * @return The value of the median of the array
   */
  public double median(double [] arrayOfNumbers) {
      if (arrayOfNumbers.length == 0) {
          throw new IllegalArgumentException("Array must not be empty");
      }
      return StatUtils.percentile (arrayOfNumbers, 50.0);
  }
}
