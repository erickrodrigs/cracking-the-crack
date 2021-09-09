package arrays_and_strings;

public class StringCompression {
  public static String run(final String str) {
    if (str.length() == 0) return "";

    StringBuilder builder = new StringBuilder();
    char lastChar = str.charAt(0);
    int counter = 1;

    for (int i = 1; i < str.length(); i++) {
      char c = str.charAt(i);

      if (c != lastChar) {
        builder.append(lastChar);
        builder.append(counter);
        counter = 1;
      } else {
        counter += 1;
      }

      lastChar = c;
    }

    builder.append(lastChar);
    builder.append(counter);

    String answer = builder.toString();
    return answer.length() < str.length() ? answer : str;
  }
}
