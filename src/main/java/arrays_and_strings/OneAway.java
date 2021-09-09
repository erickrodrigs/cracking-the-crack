package arrays_and_strings;

public class OneAway {

  private static boolean checkDeletedChar(final String s1, final String s2) {
    String largest, smallest;
    boolean isOneAway = false;

    if (s1.length() > s2.length()) {
      largest = s1;
      smallest = s2;
    } else {
      largest = s2;
      smallest = s1;
    }

    for (int i = 0, j = 0; j < smallest.length(); i++) {
      char c1 = largest.charAt(i);
      char c2 = smallest.charAt(j);

      if (c1 != c2) {
        if (isOneAway) return false;

        isOneAway = true;
      } else {
        j++;
      }
    }

    return true;
  }

  private static boolean checkReplacedChar(final String s1, final String s2) {
    boolean isOneAway = false;

    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);

      if (c1 != c2) {
        if (isOneAway) return false;

        isOneAway = true;
      }
    }

    return true;
  }

  public static boolean run(final String s1, final String s2) {
    if (s1.length() == s2.length()) {
      return checkReplacedChar(s1, s2);
    } else if (s1.length() != s2.length() + 1) {
      return false;
    } else {
      return checkDeletedChar(s1, s2);
    }
  }
}
