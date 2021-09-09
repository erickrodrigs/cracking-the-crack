package arrays_and_strings;

public class URLify {
  public static char[] run(final char[] str, final int length) {
    int lastCharPosition = 0;
    int countSpaces = 0;

    for (int i = 0; i < length; i++) {
      if (str[i] != ' ') {
        lastCharPosition = i;
      }
    }

    for (int i = 0; i < lastCharPosition; i++) {
      if (str[i] == ' ') {
        countSpaces += 1;
      }
    }

    for (int i = lastCharPosition; i >= 0 && countSpaces >= 0; i--) {
      if (str[i] == ' ') {
        str[i + countSpaces * 2 - 2] = '%';
        str[i + countSpaces * 2 - 1] = '2';
        str[i + countSpaces * 2] = '0';
        countSpaces -= 1;
      } else {
        str[i + countSpaces * 2] = str[i];
      }
    }

    return str;
  }
}
