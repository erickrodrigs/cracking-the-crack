package arrays_and_strings;

public class StringRotation {
  private static boolean isSubstring(final String s1, final String s2) {
    return s1.contains(s2);
  }

  public static boolean run(String s1, String s2) {
    s1 = s1.concat(s1);
    return isSubstring(s1, s2);
  }
}
