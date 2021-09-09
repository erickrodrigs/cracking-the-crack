package arrays_and_strings;

public class IsUnique {
  public static boolean run(String str) {
    boolean[] charWasUsed = new boolean[128]; // the size of ascii table

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (charWasUsed[c]) {
        return false;
      }

      charWasUsed[c] = true;
    }

    return true;
  }
}
