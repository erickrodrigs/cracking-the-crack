package arrays_and_strings;

public class CheckPermutation {
  public static boolean run(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    int[] frequencyFirstString = new int[128];
    int[] frequencySecondString = new int[128];

    for (int i = 0; i < s1.length(); i++) {
      char c = s1.charAt(i);
      frequencyFirstString[c] += 1;
    }

    for (int i = 0; i < s2.length(); i++) {
      char c = s2.charAt(i);
      frequencySecondString[c] += 1;
    }

    for (int i = 0; i < 128; i++) {
      if (frequencyFirstString[i] != frequencySecondString[i])
        return false;
    }

    return true;
  }
}
