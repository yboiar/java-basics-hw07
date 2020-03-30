/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++ ) {
      sum += i;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int sum = 0;
    for (int number: numbers) {
      sum += number;
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    int i = lowerBound;
    int sum = 0;
    int count = 0;
    while (i >= lowerBound && i <= upperBound) {
      sum += i;
      i++;
      count++;
    }
    return (double) sum/ count;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    int i = 0;
    int sum = 0;
    do {
      sum += numbers[i];
      i++;
    }
    while (i < numbers.length);
    return (double) sum/ numbers.length;
  }
}