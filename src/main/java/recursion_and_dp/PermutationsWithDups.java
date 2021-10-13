package recursion_and_dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationsWithDups {
  private static HashSet<String> truthSource;

  private static List<String> getPermutations(String s) {
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

        if (!truthSource.contains(result)) {
          permutations.add(result);
          truthSource.add(result);
        }
      }
    }

    return permutations;
  }

  public static List<String> run(String s) {
    truthSource = new HashSet<>();
    return getPermutations(s);
  }
}
