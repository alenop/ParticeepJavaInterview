package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> doubleList = new ArrayList<>();
    if (input.isEmpty()) {
      return doubleList;
    }
    for (int i : input) {
      double finalDouble = Math.pow(((i * 2) + 3), 5);
      doubleList.add(finalDouble);
    }

    return doubleList;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> result = new ArrayList<>();
    if (input.isEmpty()) {
      return input;
    }

    for (String word : input) {
      if (word.equals("")) {
        return input;
      }
      String first = Character.toString(word.charAt(0));
      word = word.replaceFirst(first, first.toUpperCase());
      word = word + word;
      result.add(word);
    }
    return result;
  }

}
