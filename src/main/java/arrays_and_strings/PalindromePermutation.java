package arrays_and_strings;

public class PalindromePermutation {
  public static boolean run(String str) {
    final int[] frequency = new int[128];

    str = str.toLowerCase().replaceAll("\\s+", "");

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      frequency[c] += 1;
    }

    if (str.length() % 2 == 0) {
      for (int occur : frequency) {
        if (occur % 2 != 0) {
          return false;
        }
      }
    } else {
      boolean hasOdd = false;

      for (int occur: frequency) {
        if (occur % 2 != 0) {
          if (hasOdd) return false;

          hasOdd = true;
        }
      }
    }

    return true;
  }
}
