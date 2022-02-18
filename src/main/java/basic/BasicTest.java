package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use
 * Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    int j;
    int result = i;
    if (i >= 0 && n >= 0) {
      if (n == 0) {
        return Option.of(1);
      }
      for (j = 1; j < n; j++) {
        try {
          result = result * i;
        } catch (Exception e) {
          return Option.none();
        }
      }
      if (i != 0 && result == 0) {
        return Option.none();
      }
      return Option.of(result);
    } else {
      return Option.none();
    }
  }
}
