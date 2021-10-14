package recursion_and_dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
  public static List<List<Integer>> run(List<Integer> set) {
    if (set.isEmpty())
      return new ArrayList<>(Arrays.asList(new ArrayList<>())); // returns [[]]
    
    if (set.size() == 1)
      return new ArrayList<>(Arrays.asList(new ArrayList<>(), set)); // returns [[], [elem]]

    int size = set.size();
    int elem = set.get(size - 1); // fix last element of set

    List<List<Integer>> answer = new ArrayList<>();
    List<List<Integer>> subAnswer = run(set.subList(0, size - 1)); // get the answer for a subset

    answer.addAll(subAnswer); // add all answer from subset

    // copy the previous subsets and add the fixed element to all subsets
    for (List<Integer> list : subAnswer) {
      List<Integer> copy = new ArrayList<>(list);
      copy.add(elem);
      answer.add(copy);
    }

    return answer;
  }
}
