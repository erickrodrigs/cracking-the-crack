package recursion_and_dp;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithoutDups {
  public static List<String> run(String s) {
    List<String> permutations = new ArrayList<>();

    if (s.isEmpty()) {
      permutations.add("");
      return permutations;
    }

    char c = s.charAt(0);
    String subs = s.substring(1);
    List<String> words = run(subs);

    for (String word : words) {
      for (int i = 0; i <= word.length(); i++) {
        String firstPart = word.substring(0, i);
        String secondPart = word.substring(i);
        String result = firstPart + c + secondPart;
  
        permutations.add(result);
      }
    }

    return permutations;
  }
}
